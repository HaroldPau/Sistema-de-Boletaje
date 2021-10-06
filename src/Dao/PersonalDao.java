
package Dao;
import Bean.Personal;
import Util.ConexionBD;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PersonalDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    public boolean Distribucion(String codigo, String nombre,String  apellidopa,String apellidoma,String tidentificacion,String nidentificacion,String sexo,String fechanaci,String direccion,String distrito,String telefono,String celular,String activo,String propietario,String cargo,String tipolicencia,String nlicencia,String vencimientolicencia,FileInputStream foto,int longitud){
        
        try {
            String sql="insert Personal (codigo,nombre,apellido_pa,apellido_ma,TipoIdentificacion,numeroIdentificacion,sexo,fechaNacimiento,direccion,Distrito,telefono,celular,activo,propietario,cargo,tipo_Licencia,numero_Licencia,caduca_Licencia,foto)" +
                                     "select ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
            
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            pt.setString(1, codigo);
            pt.setString(2, nombre);
            pt.setString(3, apellidopa);
            pt.setString(4, apellidoma);
            pt.setString(5, tidentificacion);
            pt.setString(6, nidentificacion);
            pt.setString(7, sexo);
            pt.setString(8, fechanaci);
            pt.setString(9, direccion);
            pt.setString(10, distrito);
            pt.setString(11, telefono);
            pt.setString(12, celular);
            pt.setString(13, activo);
            pt.setString(14, propietario);
            pt.setString(15, cargo);
            pt.setString(16, tipolicencia);
            pt.setString(17, nlicencia);
            pt.setString(18, vencimientolicencia);
            pt.setBlob(19,foto,longitud);
            pt.execute();
            
            pt.close();
            cn.close();
            
            
            System.out.println("REGISTRADO");
            return true;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE REGISTRAR" + e);
        }
        
        return false;
    }
    
    public ArrayList<Personal> ObtenerPersonal(){
        ArrayList<Personal> ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma,cargo,TipoIdentificacion,numeroIdentificacion,sexo,direccion,Distrito,telefono,celular FROM PERSONAL order by apellido_pa asc")) {
                while(rset.next()){
                    Personal ODB = new Personal();
                    ODB.setNombre(rset.getString(1));
                    ODB.setApellidopa(rset.getString(2));
                    ODB.setApellidoma(rset.getString(3));
                    ODB.setCargo(rset.getString(4));
                    ODB.setTidentificacion(rset.getString(5));
                    ODB.setNidentificacion(rset.getString(6));
                    ODB.setSexo(rset.getString(7));
                    ODB.setDireccion(rset.getString(8));
                    ODB.setDistrito(rset.getString(9));
                    ODB.setTelefono(rset.getString(10));
                    ODB.setCelular(rset.getString(11));
                    
                    ListaPersonal.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        }
        return ListaPersonal;
    }
    public Blob BuscarFoto(String codigo){
        Blob foto = null;
        try {
            String sql="select foto from personal where numeroIdentificacion ="+codigo;            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                if(rset.next()){
                    foto= rset.getBlob(1);
                    
                }
                
                cn.close();
                stmt.close();
            }            
            
            
            return foto;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE REGISTRAR" + e);
        }
        
        return foto;
    }
    
    public ArrayList<Personal> ObtenerPropietario(){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma,TipoIdentificacion,numeroIdentificacion,direccion,Distrito,telefono,celular FROM PERSONAL where propietario = 'SI'")) {
                while(rset.next()){
                    Personal ODB = new Personal();
                    ODB.setNombre(rset.getString(1));
                    ODB.setApellidopa(rset.getString(2));
                    ODB.setApellidoma(rset.getString(3));
                    ODB.setTidentificacion(rset.getString(4));
                    ODB.setNidentificacion(rset.getString(5));
                    ODB.setDireccion(rset.getString(6));
                    ODB.setDistrito(rset.getString(7));
                    ODB.setTelefono(rset.getString(8));
                    ODB.setCelular(rset.getString(9));
                    
                    ListaPersonal.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PROPIETARIOS SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PROPIETARIOS "+ex);
        }
        return ListaPersonal;
    }
    
    public String ObtenerCodigo(String identificacion){
        String codigo = null;
        try {
            String sql="select codigo from personal where numeroIdentificacion ="+identificacion;            
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                if(rset.next()){
                    codigo= rset.getString(1);
                    
                }
                
                cn.close();
                stmt.close();
            }            
            
            
            return codigo;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO PAPA" + e);
        }
        
        return codigo;
    }
    public int contarEmpleado(){
        int numero=0;
        try {
            String sql="select count(*) from personal";            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                if(rset.next()){
                    numero= rset.getInt(1);
                    
                }
                
                cn.close();
                stmt.close();
            }            
            
            
            return numero;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONTAR PERSONAL" + e);
        }
        
        return numero;
    }
    
    public String ObtenerNombre(String codigo){
        String nombre = null;
        try {
            String sql="select nombre,apellido_pa,apellido_ma from personal where codigo = '"+codigo+"'";            
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery(sql)) {
                if(rset.next()){
                    nombre= rset.getString(1)+" "+rset.getString(2)+" "+rset.getString(3);
                    
                }
                
                cn.close();
                stmt.close();
            }            
            
            
            return nombre;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER nombre PAPA" + e);
        }
        
        return nombre;
    }
    public boolean verificarIdentificacion(String identificacion){
        
        try {
            String sql="select numeroIdentificacion from personal where numeroIdentificacion ="+identificacion;            
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            
            if(rset.next()){
                cn.close();
                stmt.close();
                rset.close();
                return true; 
                
            }           
            
            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO PAPA" + e);
        }
        
        return false;
    }
    public ArrayList<Personal> FiltrarPersonal(String Letra){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma,cargo,TipoIdentificacion,numeroIdentificacion,sexo,direccion,Distrito,telefono,celular FROM PERSONAL where nombre+' '+apellido_pa+' '+apellido_ma like '%"+Letra+"%' and (cargo ='CONDUCTOR' OR cargo ='COBRADOR')and activo ='SI' order by apellido_pa asc")) {
                while(rset.next()){
                    Personal ODB = new Personal();
                    ODB.setNombre(rset.getString(1));
                    ODB.setApellidopa(rset.getString(2));
                    ODB.setApellidoma(rset.getString(3));
                    ODB.setCargo(rset.getString(4));
                    ODB.setTidentificacion(rset.getString(5));
                    ODB.setNidentificacion(rset.getString(6));
                    ODB.setSexo(rset.getString(7));
                    ODB.setDireccion(rset.getString(8));
                    ODB.setDistrito(rset.getString(9));
                    ODB.setTelefono(rset.getString(10));
                    ODB.setCelular(rset.getString(11));
                    
                    ListaPersonal.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        }
        return ListaPersonal;
    }
    
    public ArrayList<Personal> FiltrarPropietario(String Letra){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT nombre,apellido_pa,apellido_ma,cargo,TipoIdentificacion,numeroIdentificacion,sexo,direccion,Distrito,telefono,celular FROM PERSONAL where nombre+' '+apellido_pa+' '+apellido_ma like '%"+Letra+"%' and propietario = 'SI' and activo ='SI' order by apellido_pa asc")) {
                while(rset.next()){
                    Personal ODB = new Personal();
                    ODB.setNombre(rset.getString(1));
                    ODB.setApellidopa(rset.getString(2));
                    ODB.setApellidoma(rset.getString(3));
                    ODB.setCargo(rset.getString(4));
                    ODB.setTidentificacion(rset.getString(5));
                    ODB.setNidentificacion(rset.getString(6));
                    ODB.setSexo(rset.getString(7));
                    ODB.setDireccion(rset.getString(8));
                    ODB.setDistrito(rset.getString(9));
                    ODB.setTelefono(rset.getString(10));
                    ODB.setCelular(rset.getString(11));
                    
                    ListaPersonal.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PERSONAL SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PERSONAL "+ex);
        }
        return ListaPersonal;
    }
    public ResultSet DetallePersonal(String codigo){
        ResultSet rset =null;
        try {
            String sql="select codigo,nombre,apellido_pa,apellido_ma,TipoIdentificacion,numeroIdentificacion,sexo,(select convert(varchar(30),fechanacimiento,103)),direccion,Distrito,telefono,celular,activo,propietario,cargo,tipo_Licencia,numero_Licencia,(select convert(varchar(30),caduca_licencia,103)),foto from personal where codigo = '"+codigo+"' ";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            System.out.println(rset);
        } catch (SQLException e) {
            System.err.println("NO SE OBTENER RST DE PERSONAL" + e);
        }
        
        return rset;
    }
    
    
    public boolean ActualizarPersonal(String codigo, String nombre,String  apellidopa,String apellidoma,String tidentificacion,String nidentificacion,String sexo,String fechanaci,String direccion,String distrito,String telefono,String celular,String activo,String propietario,String cargo,String tipolicencia,String nlicencia,String vencimientolicencia ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "UPDATE PERSONAL SET nombre= ? ,apellido_pa= ? ,apellido_ma= ? ,TipoIdentificacion= ? ,numeroIdentificacion= ? ,sexo= ? ,fechaNacimiento= ? ,"
                    + "direccion= ? ,Distrito= ? ,telefono= ? ,celular= ? ,activo= ? ,propietario= ? ,cargo= ? ,tipo_Licencia= ? ,numero_Licencia= ? ,caduca_Licencia= ? where codigo = ? ";
            System.out.println(sql);
            pt = cn.prepareStatement(sql);
            pt.setString(18, codigo);
            pt.setString(1, nombre);
            pt.setString(2, apellidopa);
            pt.setString(3, apellidoma);
            pt.setString(4, tidentificacion);
            pt.setString(5, nidentificacion);
            pt.setString(6, sexo);
            pt.setString(7, fechanaci);
            pt.setString(8, direccion);
            pt.setString(9, distrito);
            pt.setString(10, telefono);
            pt.setString(11, celular);
            pt.setString(12, activo);
            pt.setString(13, propietario);
            pt.setString(14, cargo);
            pt.setString(15, tipolicencia);
            pt.setString(16, nlicencia);
            pt.setString(17, vencimientolicencia);
            pt.execute();
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de personal " + e);
        }
        return false;
    }
    public boolean ActualizarFoto( FileInputStream foto,int longitud, String codigo) {
        try {
            cn = super.getConexion();
            
            String sql = "UPDATE PERSONAL SET foto = ? where codigo='"+codigo+"'";
            pt = cn.prepareStatement(sql);
            pt.setBlob(1,foto,longitud);
            pt.execute();
            
            
            /*if (n>0){
                System.out.println("!!ACTUALIZACION DE foto EXITOSA!!");
            }*/
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de boletos " + e);
        }
        return false;
    }
    
    public ArrayList<Personal> ObtenerPropietario1(){
        ArrayList<Personal> ListaPersonal;
        ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT codigo, nombre, apellido_pa,apellido_ma from Personal where propietario = 'SI'")) {
                while(rset.next()){
                    Personal ODB = new Personal();
                    ODB.setTidentificacion(rset.getString(1));
                    ODB.setNombre(rset.getString(2));
                    ODB.setApellidopa(rset.getString(3));
                    ODB.setApellidoma(rset.getString(4));                    
                    ListaPersonal.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE PROPIETARIOS SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DE PROPIETARIOS "+ex);
        }
        return ListaPersonal;
    }
}

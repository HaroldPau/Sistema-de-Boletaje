
package Dao;

import Bean.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import Util.ConexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VehiculoDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    public boolean BuscarVehiculo(String Padron){
        boolean bandera = false;
        try {
            String sql="SELECT * FROM VEHICULO WHERE padron="+Padron;            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);            
            if(rset.next()){
                bandera = true;                
            }          
            cn.close();
            stmt.close();
            rset.close();          
                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL BUSCAR" + e);
        }
        
        return bandera;
    }
    
    public boolean RegistroVehiculo(String Codigo,String Padron,String Placa,String Propietario,String marca,String modelo,String fabricacion, String Combustible)
    {
        boolean bandera = false;
        try {
            String sql="insert into vehiculo (codigo,padron,placa,propietario,marca,modelo,activo,fabricacion,combustible) values(?,?,?,?,?,?,?,?,?)";            
            
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            
            pt.setString(1, Codigo);
            pt.setString(2, Padron);
            pt.setString(3, Placa);
            pt.setString(4, Propietario);
            pt.setString(5, marca);
            pt.setString(6, modelo);
            pt.setString(7, "SI");
            pt.setString(8, fabricacion);
            pt.setString(8, Combustible);
            
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("REGISTRAR VEHICULO");
                                    
        } catch (SQLException e) {
            System.err.println("ERROR AL REGISTRAR VEHICULO" + e);
        }
        
        return bandera;
    }
    public int ContadorVehiculo(){
        int numero=0;
        try {
            String sql="select count(*) from vehiculo";            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            
            if(rset.next()){
                numero= rset.getInt(1);
                
            }           
            
            cn.close();
            stmt.close();
            rset.close();            
            
            
            return numero;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONTAR PERSONAL" + e);
        }
        
        return numero;
    }
    public String ObtenerCodigo(String identificacion){
        String codigo = null;
        try {
            String sql="select codigo from vehiculo where padron ="+identificacion;            
            
            cn = super.getConexion();
            stmt = cn.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            
            if(rset.next()){
                codigo= rset.getString(1);                
            }
            cn.close();
            stmt.close();
            rset.close();            
            
            
            return codigo;
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTENER CODIGO PAPA" + e);
        }
        
        return codigo;
    }
    public ArrayList<Vehiculo> ObtenerVehiculo(){
        ArrayList<Vehiculo> ListaPersonal = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("Select  v.codigo,v.padron,v.placa,v.propietario,v.marca,v.modelo,v.activo,v.fabricacion,(p.nombre+' '+p.apellido_pa+' '+p.apellido_ma),v.combustible from vehiculo v inner join personal p on v.propietario = p.codigo")) {
                while(rset.next()){
                    Vehiculo OV = new Vehiculo();
                    OV.setCodigo(rset.getString(1));
                    OV.setPadron(rset.getString(2));
                    OV.setPlaca(rset.getString(3));
                    OV.setPropietario(rset.getString(4));
                    OV.setMarca(rset.getString(5));
                    OV.setModelo(rset.getString(6));
                    OV.setActivo(rset.getString(7));
                    OV.setFabricacion(rset.getString(8));
                    OV.setNombreC(rset.getString(9));
                    OV.setCombustible(rset.getString(10));
                    
                    
                    ListaPersonal.add(OV);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE VEHICULO SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL VEHICULO DE PERSONAL "+ex);
        }
        return ListaPersonal;
    }
    public String ObtenerPlaca(String identificacion){
        String codigo = null;
        try {
            String sql="select placa from vehiculo where padron ="+identificacion;            
            
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
    public String ObtenerPadron(String identificacion){
        String codigo = null;
        try {
            String sql="select padron from vehiculo where codigo = '"+identificacion+"'";            
            
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
            System.err.println("NO SE PUEDE OBTENER padron PAPA" + e);
        }
        
        return codigo;
    }
    public boolean ActualizarVehiculo(String Codigo,String Padron,String Placa,String Propietario,String marca,String modelo,String fabricacion, String Combustible ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "UPDATE VEHICULO SET PADRON = "+Padron+", placa= '"+Placa+"',Propietario ='"+Propietario+"',marca ='"+marca+"' ,modelo ='"+modelo+"' , combustible ='"+Combustible+ "' WHERE codigo ='"+Codigo+"'" ;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE VEHICULO EXITOSO!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de vehiculo " + e);
        }
        return false;
    }
    
    public boolean ActualizarCaducidad(String fecha, String Codigo ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "UPDATE DETALLEVEHICULO SET FECHART = '"+fecha+"' where padron = '"+Codigo+"'" ;
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE vencimiento VEHICULO EXITOSO!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de vehiculo " + e);
        }
        return false;
    }
    
    public String ObtenerfechaRT(String identificacion){
        String codigo = null;
        try {
            String sql="select (select convert(varchar(30),fechaRT,3)) from detalleVehiculo where padron = '"+identificacion+"'";            
            
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
            System.err.println("NO SE PUEDE OBTENER  FECHA RT PAPA" + e);
        }
        
        return codigo;
    }
    public int[] FechaRT(String codigo){
        ResultSet rset =null;
        int[] datos = new int[3];
        
        try {
            String sql="select YEAR(fechaRT),MONTH (fechaRT),DAY(fechaRT) from detalleVehiculo WHERE padron = '"+codigo+"'";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getInt(1);
            datos[1]=rset.getInt(2);
            datos[2]=rset.getInt(3);
            rset.close();
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE OBTERNET FECHA RV TECNICA" + e);
        }
        
        return datos;
    } 
    
    
}

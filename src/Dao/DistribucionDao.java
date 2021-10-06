
package Dao;
import Bean.DistribucionBoletos;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class DistribucionDao extends ConexionBD {
    
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    public int Iddistribucion(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select count(*) from distribucion");
            
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR DISTRIBUCION"+ex);
        }
        return 0;
    }
    public void RegistrarDistibucion(int id, String Operador, String fecha, String usuario, String Padron,String horas){
        try {
            cn = super.getConexion();
            pt =cn.prepareStatement("Insert into distribucion Values(?,?,?,?,?,?)");
            pt.setInt(1, id);
            pt.setString(2, usuario);
            pt.setString(3, Operador);
            pt.setString(4, Padron);
            pt.setString(5, fecha);
            pt.setString(6, horas);
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("----------");
            System.out.println(fecha);
            System.out.println("DISTRIBUCION OK");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO REGISTRAR DISTRIBUCION "+ex);
        }
    }    
    public void RegistrarDetalleD(int id, String inicio, String Final, double precio){
        try {
            cn = super.getConexion();
            pt = cn.prepareStatement("insert into Detalledistribucion (precio,inicio,fin,activo,Distribucion,anulado,observado)values(?,?,?,?,?,?,?)");
            pt.setDouble(1, precio);
            pt.setString(2, inicio);
            pt.setString(3,Final);
            pt.setString(4,"SI");
            pt.setInt(5, id);
            pt.setString(6,"NO");
            pt.setString(7,"NO");
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("DETALLE OK");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO REGISTRAR DISTRIBUCION "+ex);
        }
    }    
    public ArrayList<DistribucionBoletos> ObtenerBoletos(String precio, String padron){
            ArrayList<DistribucionBoletos> ListaBoletos;
            ListaBoletos = new ArrayList<>();
        try {          
            cn=super.getConexion();
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT dt.INICIO FROM Detalledistribucion dt inner join Distribucion d on dt.Distribucion = d.codigo where activo ='SI' and d.padron='"+padron+"' and dt.precio="+precio);
            while(rs.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setInicio(rs.getString(1));
                    ListaBoletos.add(ODB);
                }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            rs.close();
                    
            } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR BOLETOS "+ex);
        }
        
        return ListaBoletos;
    }    
    public String[] Busqueda2(String codigo,String precio){
        ResultSet rset =null;
        String[] datos = new String[4];
        
        try {
            String sql="select (p.nombre+' '+p.apellido_pa+' '+p.apellido_ma),(select convert(varchar(30),d.fecha,3)),d.usuario,d.hora from DISTRIBUCION d inner join personal p on d.operador = p.codigo inner join Detalledistribucion dt on d.codigo = dt.Distribucion where inicio = '"+codigo+"' and precio = "+precio + " and anulado = 'NO' and dt.activo = 'SI'";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getString(1);
            datos[1]=rset.getString(2);
            datos[2]=rset.getString(3);
            datos[3]=rset.getString(4);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONSULTAR" + e);
        }
        
        return datos;
    }    
    public ArrayList<DistribucionBoletos> ObtenerBoletosLiquidacion( String padron){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT dt.CODIGO,PRECIO, INICIO FROM DETALLEDISTRIBUCION dt inner join distribucion d on d.codigo = dt.distribucion  WHERE ACTIVO = 'SI' AND PADRON = '"+padron+"' ORDER BY PRECIO DESC")) {
                while(rset.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setCodigo(rset.getInt(1));
                    ODB.setPrecio(rset.getDouble(2));
                    ODB.setInicio(rset.getString(3));
                    ListaBoletos.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR BOLETOS "+ex);
        }
        return ListaBoletos;
    }
    public boolean ActualizarDistribucion(String inicio, String Ninicio, String Padron, double precio , String Activo ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update dt  set dt.inicio = '"+inicio+"' ,dt.activo='"+Activo+"' from  Detalledistribucion dt inner join distribucion d on d.codigo = dt.distribucion where dt.inicio = '"+Ninicio+"'  and D.padron = '"+Padron+"' and dt.precio ="+precio +" and anulado = 'NO'" ;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de boletos " + e);
        }
        return false;
    }    
    public ResultSet Busqueda(String codigo,String precio){
        ResultSet rset =null;
        try {
            String sql="select operador,p.nombre,p.apellido_pa,p.apellido_ma,p.numeroIdentificacion,padron,(select convert(varchar(30),fecha,3)) as fechita from Personal p " +
        " inner join Distribucion d on  d.operador = p.codigo  inner join HistorialBoleto h on d.codigo= h.Distribucion  where inicio <= '"+codigo+"' and fin >= '"+codigo+"' and precio ="+ precio +"order by fecha asc";
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            System.out.println(rset);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE REGISTRAR" + e);
        }
        
        return rset;
    }
    public boolean AnularBoleto(int codigo, String Activo, String Anulado ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update dt  set dt.anulado = '"+Anulado+"' ,dt.activo='"+Activo+"' from  Detalledistribucion dt inner join distribucion d on d.codigo = dt.distribucion where dt.codigo ="+ codigo ;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ANULACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de boletos " + e);
        }
        return false;
    } 
    public int idDetalle(String inicio, double precio, String padron){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("SELECT dt.codigo FROM DETALLEDISTRIBUCION dt inner join distribucion d on d.codigo = dt.distribucion  WHERE dt.ACTIVO = 'SI' AND d.PADRON = '"+padron+"' and dt.inicio ='"+inicio+"' and dt.precio ="+precio+"  ORDER BY PRECIO DESC");
            
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener ID DETALLE"+ex);
        }
        return 0;
    }

    /**
     *
     * @param Cod
     * @return
     */
    public int idDistribucion(int Cod){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("SELECT dt.distribucion FROM DETALLEDISTRIBUCION dt inner join distribucion d on d.codigo = dt.distribucion  WHERE dt.codigo = "+Cod);
            
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener id distribucion"+ex);
        }
        return 0;
    }
    public int idDetalle(String inicio, double precio, String padron,String fecha){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("SELECT dt.codigo FROM HISTORIALBOLETO dt inner join distribucion d on d.codigo = dt.distribucion  WHERE d.PADRON = '"+padron+"' and dt.inicio ='"+inicio+"' and dt.precio ="+precio+" and d.fecha ='"+fecha+"'   ORDER BY PRECIO DESC");
            
            if(rs.next()){
                id=rs.getInt(1);
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO obtener id Detalle 2 "+ex);
        }
        return 0;
    }    
    public ArrayList<DistribucionBoletos> HistorialBoleto( String padron, String Fecha){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT PRECIO, INICIO ,(p.nombre+' '+p.apellido_pa+' '+p.apellido_ma) as nombre FROM HISTORIALBOLETO dt inner join distribucion d on d.codigo = dt.distribucion inner join Personal p on d.operador = p.codigo  WHERE PADRON = '"+padron+"' AND D.fecha= '"+Fecha+"' order BY  nombre desc , precio desc")) {
                while(rset.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setPrecio(rset.getDouble(1));
                    ODB.setInicio(rset.getString(2));
                    ODB.setOperador(rset.getString(3));
                    ListaBoletos.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR HISTORIAL BOLETOS "+ex);
        }
        return ListaBoletos;
    }
    public boolean ActualizarDistribucion(String operador , int codigo ) {
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            String sql = "update distribucion  set operador = '"+operador+"' where codigo = "+codigo ;
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            System.out.println(sql);
            if (n>0){
                System.out.println("!!ACTUALIZACION DE BOLETOS EXITOSA!!");
            }
            stmt.close();
            cn.close();
            
            return true;
        } catch (SQLException e) {
            System.err.println("problemas en la actualizacion de boletos " + e);
        }
        return false;
    }  
      public String[] Pegado(String padron){
        ResultSet rset =null;
        String[] datos = new String[2];
        
        try {
            String sql="select d.operador, (p.nombre +' '+p.apellido_pa + ' '+p.apellido_ma) from Distribucion d inner join personal p on p.codigo = d.operador where padron= '"+padron+"' order by fecha desc, d.codigo desc";
            System.out.println(sql);
            cn = super.getConexion();
            stmt = cn.createStatement();
            rset = stmt.executeQuery(sql);
            rset.next();
            datos[0]=rset.getString(1);
            datos[1]=rset.getString(2);
        } catch (SQLException e) {
            System.err.println("NO SE PUEDE CONSULTAR PEGADO" + e);
        }
        
        return datos;
    }
      
      
      public ArrayList<DistribucionBoletos> ResponsablePorMes( String codigo, int mes, int año){
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("SELECT v.padron, (select convert(varchar(30),d.fecha,3)), d.hora FROM Distribucion d inner join vehiculo v on d.padron = v.codigo WHERE operador = '"+codigo+"' and DATEPART(MONTH, d.fecha) =  "+mes+" and DATEPART(YEAR,d.fecha)= "+año)) {
                while(rset.next()){
                    DistribucionBoletos ODB = new DistribucionBoletos();
                    ODB.setPadron(rset.getInt(1));
                    ODB.setFecha(rset.getString(2));
                    ODB.setHora(rset.getString(3));
                    
                    ListaBoletos.add(ODB);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE BOLETO EXITOSO");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR HISTORIAL BOLETOS "+ex);
        }
        return ListaBoletos;
    }
      
      
    
    
    
}

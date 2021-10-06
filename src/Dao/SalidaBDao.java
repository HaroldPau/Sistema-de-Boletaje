
package Dao;
import Bean.Despacho;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SalidaBDao extends ConexionBD{
    
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    public int idDespachoB(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select id from despachob order by id desc");
            
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
            
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR Despacho"+ex);
        }
        return 0;
    }
    public boolean RegistrarDespachoB(int id, int padron, String Hora, String conductor, String fecha){
        boolean bandera = false;
        try {
            String sql="insert into Despachob (id,padron,hora_salida,fecha,conductor) values(?,?,?,?,?)";            
            
            cn = super.getConexion();
            pt = cn.prepareStatement(sql);
            
            pt.setInt(1, id);
            pt.setInt(2, padron);
            pt.setString(3, Hora);
            pt.setString(4, fecha);
            pt.setString(5, conductor);            
            pt.execute();
            cn.close();
            pt.close();
            System.out.println("Añadido a DespachoB");
            bandera = true;
                                    
        } catch (SQLException e) {
            System.err.println("Error al añadir a DespachoB" + e);
            bandera = false;
        }
        
        return bandera;}        
    public ArrayList<Despacho> Lista_DespachoB(String fecha){
        ArrayList<Despacho> ListaDespB = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select * from DespachoB where fecha = '"+fecha+"' order by hora_salida asc" )) {
                while(rset.next()){
                    Despacho OD = new Despacho();
                    OD.setId(rset.getInt(1));
                    OD.setPadron(rset.getInt(2));
                    OD.setHora(rset.getString(3));
                    OD.setFecha(rset.getString(4));
                    OD.setConductor(rset.getString(5));                                       
                    
                    ListaDespB.add(OD);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE DESPACHO B SACTIFACTORIO");
            
            
        } catch (SQLException ex) {
            System.err.println("PROBLEMA EN EL LISTADO DESPACHO B "+ex);
        }
        
        return ListaDespB;
        
    }
    public void EliminarSaldia(int id){
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("delete despachoB where id = "+id);
            
            
            stmt.close();
            cn.close();
            
            System.out.println("SE PUDO ELIMINAR DESPACHOB");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO ELIMINAR DESPACHOB"+ex);
        }
    }
    
}



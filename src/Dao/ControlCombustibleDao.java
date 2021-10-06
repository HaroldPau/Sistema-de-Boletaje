
package Dao;

import Bean.ControlCombustible;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Util.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlCombustibleDao extends ConexionBD{
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    public boolean RegistrarConsumo(int id, float vuelta,String Padron,String Fecha,float Total, float Galones ,String Usuario ){
        
        String Precio=String.valueOf(Total);
        String Galon=String.valueOf(Galones);
        String vueltas=String.valueOf(vuelta);
        try {
            cn = super.getConexion();
            pt = cn.prepareStatement("INSERT INTO ConsumoPetroleo VALUES (?,?,?,"+Galon+",?,?,"+vueltas+","+Precio+")");
            pt.setInt(1, id);            
            pt.setString(2, Padron);
            pt.setInt(3, 1);            
            pt.setString(4, Fecha);
            pt.setString(5, Usuario);
            
            
            
            pt.execute();
            pt.close();
            cn.close();
            System.out.println("ConsumoPetroleo GOZUEL");
            return true;
        } catch (SQLException e) {
            System.err.println("ERROR ConsumoPetroleo" + e);
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR ConsumoPetroleo"+ e);
        }
        
        return false;
    }
    
    public int idConsumoPetroleo(){
        int id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select idConsumo from ConsumoPetroleo order by idConsumo desc");
            
            if(rs.next()){
                id=rs.getInt(1)+1;
                rs.close();
                cn.close();
                return id;
            }
            rs.close();
            cn.close();
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO CONTAR ConsumoPetroleo"+ex);
        }
        return 0;
    }
    
    public void ActualizarConsumoPetroleo(float precio,float vuelta,int codigo,float galon){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("update ConsumoPetroleo set vueltas ="+vuelta+" , totalPago = "+precio+" , cantidadgalon ="+galon+" where idConsumo = "+codigo);
            
            
            stmt.close();
            cn.close();
            
            System.out.println("SE PUDO actualizar ControlCombustible");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO actualizar vuelta liquidacion"+ex);
        }
        
    }
     public ArrayList<ControlCombustible> ListaControlCombustibleActualizar( String fecha, String padron){
        ArrayList<ControlCombustible> ListaControl;
        ListaControl = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select idConsumo,v.padron,totalPago,vueltas from ConsumoPetroleo inner join vehiculo v on ConsumoPetroleo.Vehiculo = v.codigo where fecha = '"+fecha+"' and ConsumoPetroleo.vehiculo = '"+padron+"' ")) {
                while(rset.next()){
                    ControlCombustible OC = new ControlCombustible();
                    OC.setIdCombustible(rset.getInt(1));
                    OC.setVehiculo(String.valueOf(rset.getInt(2)));
                    OC.setTotalPago(rset.getFloat(3));
                    OC.setVueltas(rset.getFloat(4));
                    
                    ListaControl.add(OC);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR Control Petroleo DIARIA "+ex);
        }
        return ListaControl;
    }
     
     public ArrayList<ControlCombustible> ListaFaltaCombustible(String Fecha){
        ArrayList<ControlCombustible> ListaControl;
        ListaControl = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select padron, monto, vuelta, fecha from observados where promedio < 120 and fecha = '"+Fecha+"' and combustible='DISEL'" )) {
                while(rset.next()){
                    ControlCombustible OC = new ControlCombustible();                    
                    OC.setVehiculo(String.valueOf(rset.getInt(1)));
                    OC.setTotalPago(rset.getFloat(2));
                    OC.setVueltas(rset.getFloat(3));
                    OC.setFecha(rset.getString(4));
                    
                    ListaControl.add(OC);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR Control Petroleo DIARIA "+ex);
        }
        return ListaControl;
    } 
     public void eliminar(int id){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            stmt.executeUpdate("delete ConsumoPetroleo where idConsumo = "+id);
            
            
            stmt.close();
            cn.close();
            
            System.out.println("SE PUDO ELIMINAR Consumo Petroleo");
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO ELIMINAR Consumo Petroleo"+ex);
        }
        
    }
     
     public ArrayList<ControlCombustible> ListaFaltaCombustibleGNV(String Fecha){
        ArrayList<ControlCombustible> ListaControl;
        ListaControl = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select padron, monto, vuelta, fecha from observados where promedio < 120 and fecha = '"+Fecha+"' and combustible='GNV'" )) {
                while(rset.next()){
                    ControlCombustible OC = new ControlCombustible();                    
                    OC.setVehiculo(String.valueOf(rset.getInt(1)));
                    OC.setTotalPago(rset.getFloat(2));
                    OC.setVueltas(rset.getFloat(3));
                    OC.setFecha(rset.getString(4));
                    
                    ListaControl.add(OC);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR Control Petroleo DIARIA "+ex);
        }
        return ListaControl;
    }
     
     public ArrayList<ControlCombustible> ListaCombustiblexMes(String padron , int mes , int año){
        ArrayList<ControlCombustible> ListaControl;
        ListaControl = new ArrayList<>();
        try {           
            
            cn=super.getConexion();
            stmt = cn.createStatement();
            try (ResultSet rset = stmt.executeQuery("select padron, sum(totalPago), max (vueltas), (select convert(varchar(30),fecha,3)) from ConsumoPetroleo c  inner join vehiculo v on c.Vehiculo = v.codigo where DATEPART(MONTH, fecha) = "+mes+" and DATEPART(YEAR,fecha) = "+año+" and c.vehiculo ='"+padron+"' group by fecha, padron" )) {
                while(rset.next()){
                    ControlCombustible OC = new ControlCombustible();                    
                    OC.setVehiculo(String.valueOf(rset.getInt(1)));
                    OC.setTotalPago(rset.getFloat(2));
                    OC.setVueltas(rset.getFloat(3));
                    OC.setFecha(rset.getString(4));
                    
                    ListaControl.add(OC);
                }
            }
            stmt.close();
            cn.close();
            System.out.println("LISTADO DE LIQUIDACION DIARIA");
            
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR Control Petroleo DIARIA "+ex);
        }
        return ListaControl;
    } 
     
}

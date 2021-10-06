

package Dao;

import Util.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidacionLogin extends ConexionBD{
    Connection cn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public boolean logeo(String usu, String pass){
        
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("Select * from usuario where usu = '"+usu+"' and pass ='"+pass+"'");
            
            if(rs.next()){
                rs.close();
                stmt.close();
                cn.close();
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ValidacionLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    public int nivel (String usu){
        int numero = 0;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("Select nivel from usuario where usu = '"+usu+"'");
            
            if(rs.next()){
                numero= rs.getInt(1);
                rs.close();
                stmt.close();
                cn.close();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ValidacionLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       return numero;
    }
    
}

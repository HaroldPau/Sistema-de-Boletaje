
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Util.ConexionBD;
import java.sql.SQLException;


public class CombustibleDao extends ConexionBD {
    Connection cn = null;
    Statement stmt = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    public float ConsultaPrecio(){
        float id;
        try {
            cn = super.getConexion();
            stmt = cn.createStatement();
            rs=stmt.executeQuery("select precio from Combustible where idCombustible = 1");
            
            if(rs.next()){
                id=rs.getFloat(1);
                rs.close();
                cn.close();
                return id;
            }
            rs.close();
            cn.close();
        } catch (SQLException ex) {
            System.err.println("NO SE PUDO OBTENER PRECIO COMBUSTIBLE "+ex);
        }
        return 0;
    }

    
}

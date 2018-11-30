package servicios;
import java.sql.*;
/**
 *
 * @author Ismael Flores Meléndze
 * 15/Nov/18
 * 
 */
public class Conexion {
    private static Connection cnx = null;
    private static Connection obtener () throws SQLException, ClassNotFoundException{
        if (cnx == null){
            try{
                Class.forName("com.msql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql//localhost/java_mysql", "root","");
            }catch(SQLException ex){
                throw new SQLException(ex);
            }catch(ClassNotFoundException ex){
                throw new ClassNotFoundException (ex.getMessage());
            }
        }return cnx;
    }

    public static void cerrar() throws SQLException{
        if(cnx != null){
            cnx.close();
        }
    }
}

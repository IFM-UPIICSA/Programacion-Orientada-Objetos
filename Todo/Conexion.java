// Fernando Luque M.
//java ClassInfo X		para obtener info de la clase X
//
import java.io.*;
import java.sql.*;

public class Conexion implements Serializable {
	public static void main ( String args[] )	{
		Statement stmt;
		ResultSet rs;
		Connection con = null;
		String url, r="", cueri, driver = "com.mysql.jdbc.Driver";
//								driver = "com.informix.jdbc.IfxDriver";
		try	{
			Class.forName(driver).newInstance();
			url = "jdbc:mysql://localhost:3306/Capacita";
//			url = "jdbc:informix-sqli://168.255.201.248:1526/bd_materiales:informixserver=srmsdes_tcp;user=x;password=x";
//			url = "jdbc:informix-sqli://168.255.201.202:1525/siapsep_des:informixserver=dsuninf_shm;user=y;password=y";
//			url = "jdbc:sybase:Tds:localhost:2638/Capacita";

//			con = DriverManager.getConnection(url);
			con = DriverManager.getConnection(url, "root", "hornet");
			stmt = con.createStatement();
			//cueri = "SELECT * FROM Empleado";
			cueri = "SELECT SUM(importe_costo) FROM Departamento, Empleado, Curso, Emp_Curso ";
			cueri += " WHERE Departamento.cve_depto	= Empleado.cve_depto";
			cueri += " AND Empleado.cve_emp			= Emp_Curso.cve_emp";
			cueri += " AND Curso.cve_curso				= Emp_Curso.cve_curso";
			cueri += " AND Departamento.descrip_depto	= 'produccion'";

			rs = stmt.executeQuery(cueri);
			while(rs.next())	{
				r += rs.getInt(1);
				r += "\t";
				/*r += rs.getString(2);
				r += "\t";
				r += rs.getString(3);
				r += "\t"; */
				System.out.println(r);
				r= "";
			}
			con.close();
		}
		catch(SQLException e)	{
			while (e != null)	{
				System.out.println("SQL Excepcion " + e.getMessage());
				System.out.println("SQL State: " + e.getSQLState());
				System.out.println("VendorError: " + e.getErrorCode());
				e = e.getNextException();
			}
		}
		catch(Exception e)	{
			System.out.println("generic Exception " +e.toString());
			e.printStackTrace();
		}
	}	// main
}		// Conexion

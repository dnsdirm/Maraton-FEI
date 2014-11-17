import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
public class BaseDeDatos {
	private Connection conexion;
	private Statement sent;
	private ResultSet resultado;
	private String bdNombre;
	
	public BaseDeDatos(String bdNombre)
	{
		this.bdNombre = bdNombre;
	}
	public boolean conectar()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection("jdbc:sqlite:"+bdNombre);
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Error Conectar : " + this.getClass() + " : " + e.getMessage());
		}
	    
	    if(conexion != null)
	    	return true;
		return false;
	}
	public void desconectar()
	{
	    try {
	    	if(conexion != null)
	    	{
	    		resultado.close();
	    		conexion.close();
	    	}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error deconectar " + this.getClass() + " " + e.getMessage());
		}
	}
	public ResultSet ejecutaConsulta(String consulta)
	{
		
	    try {
	    	sent = conexion.createStatement();
			resultado = sent.executeQuery(consulta);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error ejecutarConsulta " + this.getClass() + " " + e.getMessage());
		}
		return resultado;
	}
	public static void main(String[] args) {
		BaseDeDatos bd = new BaseDeDatos("bdmaraton.db3");
		bd.conectar();
		ResultSet rs = bd.ejecutaConsulta("Select * from baseadmon");
		try {
			while(rs.next())
			{
				JOptionPane.showMessageDialog(null, "Pregunta " + rs.getInt(1) + "->" + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bd.desconectar();
	}

}

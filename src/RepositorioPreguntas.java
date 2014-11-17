import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RepositorioPreguntas {
	private  ArrayList<Pregunta> repositorio;
	private  ArrayList<Pregunta> contestadas;
	private  ArrayList<Pregunta> incorrectas;
	
	
	public RepositorioPreguntas()
	{
		repositorio = new ArrayList<Pregunta>();
		contestadas = new ArrayList<Pregunta>();
		incorrectas = new ArrayList<Pregunta>();
		
		BaseDeDatos bd = new BaseDeDatos("bdmaraton.db3");
		bd.conectar();
		ResultSet rs = bd.ejecutaConsulta("Select * from baseadmon");
		try {
			while(rs.next())
			{
				repositorio.add(new Pregunta(rs.getInt(1),
											rs.getString(2), 
											rs.getString(3), 
											rs.getString(4), 
											rs.getString(5), 
											rs.getString(6), 
											rs.getString(7)));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error constructor : " + this.getClass().toString() + " : " + e.getMessage());
		}
		bd.desconectar();
	}
	public Pregunta preguntaAleatoria()
	{
		
		long aleatorio = Math.round(Math.random() * 1000);
		if(repositorio.size() != 0)
			aleatorio = aleatorio % repositorio.size();
		else if(incorrectas.size() != 0)
			aleatorio = aleatorio % repositorio.size();
		else
		{
			JOptionPane.showMessageDialog(null, "Se acabaron las preguntas");
			return null;
		}
		return repositorio.remove((int )aleatorio);
	}
	
	public void setPreguntaContestada(Pregunta p)
	{
		contestadas.add(p);
	}
	
	public void setPreguntaIncorrecta(Pregunta p)
	{
		incorrectas.add(p);
	}
	public static void main(String[] args) {
		RepositorioPreguntas rp = new RepositorioPreguntas();
		Pregunta p = rp.preguntaAleatoria();
		JOptionPane.showMessageDialog(null, "Pregunta : " + p.ToString());
	}
}

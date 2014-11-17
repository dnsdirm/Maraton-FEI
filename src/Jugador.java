import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author dnsdirm
 *
 */
@SuppressWarnings("serial")
public class Jugador extends JLabel {
	private ImageIcon peque; 	/* Imagen que se pondra en el tablero*/
	private ImageIcon grande;	/* Imagen que se mostrara cuando se le pregunte en la ventana de preguntas */
	private String nombre;		/* Nombre del jugador */
	private Kilometro km; 		/* Kilometro donde se encuentra actualmente el jugador */
	private int nPreguntas;		/* Numero de preguntas que se le han echo al jugador */
	private Tablero tablero;
	
	/**
	 * Constructor de Jugador
	 * @param nombre del jugador
	 * @param dirPeque  directorio donde esta el icono pequeño
	 * @param dirGrande directorio donde este el icono grande
	 * @param km	Kilometro inicial
	 */
	public Jugador(String nombre,String dirPeque, String dirGrande,Kilometro km)
	{
		this.nombre = nombre;
		this.km = km;
		this.nPreguntas = 0;
		peque = new ImageIcon(Jugador.class.getResource(dirPeque));
		grande = new ImageIcon(Jugador.class.getResource(dirGrande));
		this.setIcon(peque);
		km.add(this);
	}
	public void setTablero(Tablero tablero)
	{
		this.tablero = tablero;
	}
	
	
	/**
	 * @return km Regresa el kilometro actual del jugador
	 */
	public Kilometro getKm() {
		return km;
	}

	/**
	 * @param km Asigna un nuevo kilometro al jugador
	 */
	public void setKm(Kilometro km) {
		this.km = km;
		if(km.getnKilometro() >= 42)
			tablero.ganaron(this);
	}

	/**
	 * @return El numero de preguntas que se le han echo al jugador
	 */
	public int getnPreguntas() {
		return nPreguntas;
	}

	/**
	 *  aumenta el numero de preguntas
	 */
	public void setnPreguntas() {
		this.nPreguntas++;
	}

	/**
	 * @return Retorna el icono opequeño del jugador para usar en el tablero
	 */
	public ImageIcon getPeque() {
		return peque;
	}

	/**
	 * @return Retorna el icono grande del jugador para usarlo en la ventana de preguntas
	 */
	public ImageIcon getGrande() {
		return grande;
	}

	/**
	 * @return Retorna el nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}

}

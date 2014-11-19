import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import java.awt.event.*; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Tablero extends JFrame {
	private JFrame mara;
	private int nJugadores;
	private Jugador turnos [];
	private int turno;
	private ArrayList<Jugador> jugadores;
	private Jugador ignorancia;
	private ArrayList<Kilometro> kilometros;
	@SuppressWarnings("unused")
	private RepositorioPreguntas rp;
	private boolean respCorrecta;
	private int[] nums = 	{0,1,2,3,4,5,6,23,24,25,26,27,28,7,22,39,40,41,42,29,8,21,38,47,48,43,30,9,20,37,46,45,44,31,10,19,36,35,34,33,32,11,18,17,16,15,14,13,12};
	private int[] colores = {0,1,2,3,4,5,6,23,24,25,26,27,28,7,22,39,40,41,42,29,8,21,38,47,48,43,30,9,20,37,46,45,44,31,10,19,36,35,34,33,32,11,18,17,16,15,14,13,12}; 
	private Color[] rgbColores = {
new Color(124,252,0),     new Color(255, 250,250),  new Color(248, 248 ,255), new Color(245, 245 ,245),new Color(220, 220 ,220), new Color(255, 250 ,240),   new Color(253, 245 ,230),
new Color(230, 230, 250), new Color(255, 240, 245), new Color(255, 228, 225), new Color(224, 255, 255),new Color(0, 255 ,255),   new Color(64, 224, 208),    new Color(250, 240 ,230),
new Color(240, 248, 255), new Color(30, 144, 255),	new Color(123, 104, 238), new Color(202, 225, 255),new Color(255, 215, 0),   new Color(72, 209, 204),    new Color(250, 235 ,215),
new Color(240, 255, 255), new Color(0 ,191, 255),	new Color(255, 215, 0),	  new Color(255, 215, 0),  new Color(255, 215, 0),	 new Color(0 ,206 ,209),     new Color(255, 239 ,213),
new Color(245, 255, 250), new Color(135, 206, 235),	new Color(255, 215, 0),	  new Color(255, 215, 0),  new Color(255, 215, 0),	 new Color(175, 238, 238),   new Color(255, 235 ,205),
new Color(240, 255, 240), new Color(135, 206, 250), new Color(70, 130, 180),  new Color(176, 196, 222),new Color(173, 216, 230), new Color(176, 224, 230),   new Color(255, 228 ,196),
new Color(255, 245, 238), new Color(255, 250, 205), new Color(255, 255, 240), new Color(255, 248, 220),new Color(255, 228, 181), new Color(255, 222 ,173),   new Color(255, 218 ,185),
};
	private JPanel contentPane;
	
	/**
	 * Crea el tablero 
	 * @param frmMaraton 
	 * @param actionListener 
	 */
	public Tablero(JFrame frmMaraton) {
		try {
			/* Cambia la apriencia de la ventana a la nativa de windows  */
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image icono = new ImageIcon(JFrame.class.getResource("/logo/logo.jpg")).getImage();
		this.setIconImage(icono);
		mara = frmMaraton;
		mara.setVisible(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		/*Cuando se presione el boton cerrar de la ventana se mostrara el dialogo de confirmacion */
		
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent evt) {
				AvisoSalir as =  new AvisoSalir(Tablero.this);
				as.setVisible(true);
			}
		}); 
		/*Define una tabla de 7x7 para los kilometros  */
		panel.setLayout(new GridLayout(7, 7, 0, 0));
		/* Crea los kilometros y los agrega */
		kilometros = new ArrayList<Kilometro>();
		for(int i = 0 ; i < 49 ; i++)
		{
			Kilometro k = new Kilometro(this,nums[i],rgbColores[i]);
			kilometros.add(k);
			panel.add(k);
		}
		jugadores = new ArrayList<Jugador>();
		nJugadores = 0;
		/*Pide el numero de jugadores que existiran */
		new SeleccionaNumeroUsuarios(this).setVisible(true);
		//JOptionPane.showMessageDialog(this, "Numnero " + nJugadores);
		
		/*Crea los jugadores en su respectivo dialogo dependediendo de cuantos se indicaron */
		switch(nJugadores)
		{
		case 2:
			new DosJugadores(this).setVisible(true);
			break;
		case 3:
			new TresJugadores(this).setVisible(true);
			break;
		case 4:
			new CuatroJugadores(this).setVisible(true);
			break;
		default:
			/*Si se cabcelos se cierra el tablero */
			this.CierraTablero();
			break;
		
		}
		/*Crea la ignorancia y la agrega al tablero */
		ignorancia = new Jugador("Ignorancia","peques/34_Ignorancia.png","grandes/96_Ignorancia.png",this.getKilometros().get(0));
		ignorancia.setTablero(this);
		for(Jugador j: jugadores)
		{
			j.setTablero(this);
		}
		//this.jugadores.add(ignorancia);
		/*Carga las preguntas desde la base de datos */
		rp = new RepositorioPreguntas();
		
		if(jugadores.size() < 2)
			this.dispose();
		else
			this.setVisible(true);
		
		/*Definiendo turnos */
		Random r = new Random();
		turnos = new Jugador[jugadores.size()];
		ArrayList<Jugador> tmp = new ArrayList<Jugador>();
		for (int i = 0; i < jugadores.size(); i++)
		{
			tmp.add(jugadores.get(i));
			turnos[i] = null;
		}
		/*se agrega al arreglo de jugadores uno sacado de la lista aleatoria */
		for(int i = 0; i < jugadores.size(); i++)
		{
			turnos[i] = tmp.remove(r.nextInt(tmp.size()));
		}
		/*Se le muestran los turnos al usuario */
		String sturnos = "";
		int j2 = 1;
		for(Jugador j : turnos)
		{
			sturnos = sturnos  + j2 +".-" +  j.getNombre() + "<br>";
			j2++;
		}
		new Turnos(this,sturnos).setVisible(true);	
		turno = 0;
		
	}
	
	/**
	 * Metodo para mover al jugador a la siguiente casilla
	 * @param uno Jugador que se movera de casilla
	 */
	public void mueveJugador(Jugador uno) {
		uno.getKm().remove(uno);
		int nKilometro = uno.getKm().getnKilometro();
		for(Kilometro k : kilometros)
		{
			if(k.getnKilometro()  == (nKilometro + 1))
			{
				uno.setKm(k);
				k.add(uno);
				this.update(this.getGraphics());
			}
		}
		
	}
	
	/**
	 * Metodo que ejecuta la clase AvisoSalir cuando se presiona el boton cerrar si se presiona salir
	 */
	public void CierraTablero()
	{
		Tablero.this.setVisible(false);
		Tablero.this.mara.setVisible(true);
		Tablero.this.dispose();
	}
	
	/**
	 * @return El numero de jugadores
	 */
	public int getnJugadores() {
		return nJugadores;
	}

	/**
	 * @param asigna el numero de jugadores que existiran
	 */
	public void setnJugadores(int nJugadores) {
		this.nJugadores = nJugadores;
	}

	/**
	 * @return Regresa la lista de jugadores
	 */
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	/**
	 * @param Agrega un jugador a la lista de jugadores
	 */
	public void setJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}

	/**
	 * @return Regresa la lista de jugadores
	 */
	public ArrayList<Kilometro> getKilometros() {
		return kilometros;
	}

	/**
	 * Ejecuta el Tablero
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					Tablero frame = new Tablero(null);
					//frame.setVisible(true);
					//Jugador j = new Jugador("Hector","peques/34_Alfil.png","grandes/96_Alfil.png",frame.getKilometros().get(0));
					//frame.setJugador(j);
								
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @param respCorrecta the respCorrecta to set
	 */
	public void setRespCorrecta(boolean respCorrecta) {
		this.respCorrecta = respCorrecta;
	}

	public void siguienteTurno() {
		respCorrecta = false;
		Pregunta p  = rp.preguntaAleatoria();
		new MuestraPregunta(this,turnos[turno],p).setVisible(true);
		turnos[turno].setnPreguntas();
		if(respCorrecta)
		{
			this.mueveJugador(turnos[turno]);
		}
			
		else
		{
			rp.setPreguntaIncorrecta(p);
			this.mueveJugador(ignorancia);
		}
		turno++;
		if(turno >= jugadores.size())
			turno = 0;
		
	}

	public void ganaron(Jugador jugador) {
		if(ignorancia.getNombre() == "Ignorancia")
			JOptionPane.showMessageDialog(this, "Ha ganado " + jugador.getNombre(),"Mal!",JOptionPane.ERROR_MESSAGE);
		else
		{
			JOptionPane.showMessageDialog(this, "Ha ganado " + jugador.getNombre() + " Preguntas hechas " + jugador.getnPreguntas() ,"Bien!",JOptionPane.INFORMATION_MESSAGE);
		}
		this.setVisible(false);
		this.dispose();
	}
	public void insertaRecord(Jugador j)
	{
		BaseDeDatos bd = new BaseDeDatos("bdmaraton.db3");
		bd.conectar();
		ResultSet rs = bd.ejecutaConsulta("insert into records values(\"" + j.getNombre() + "\","+ j.getnPreguntas() + ");");
		bd.desconectar();
	}
	/**
	 * @return the ignorancia
	 */
	public Jugador getIgnorancia() {
		return ignorancia;
	}

	

}

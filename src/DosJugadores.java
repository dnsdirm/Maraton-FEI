import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class DosJugadores extends JDialog {
	private Tablero frame;
	@SuppressWarnings("unused")
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField nj2;
	private JTextField nj1;
	private JLabel iconoJugador1;
	private JLabel iconoJugador2;
	private JComboBox<String> cb1;
	private JComboBox<String> cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DosJugadores dialog = new DosJugadores(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param frame 
	 * @param seleccionaNumeroUsuarios 
	 */
	public DosJugadores(Tablero frame) {
		super(frame);
		this.setModal(true);
		this.frame = frame;
		
		setBounds(100, 100, 626, 379);
		getContentPane().setLayout(null);
		
		JLabel lblSeleccionaLaPieza = new JLabel("Selecciona la pieza de los jugadores y sus nombres");
		lblSeleccionaLaPieza.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionaLaPieza.setBounds(10, 11, 590, 14);
		getContentPane().add(lblSeleccionaLaPieza);
		
		iconoJugador1 = new JLabel("");
		iconoJugador1.setBounds(10, 36, 96, 116);
		getContentPane().add(iconoJugador1);
		
		iconoJugador2 = new JLabel("");
		iconoJugador2.setBounds(10, 163, 96, 116);
		getContentPane().add(iconoJugador2);
		
		JLabel lblNombreDelJugador = new JLabel("Nombre del jugador 1");
		lblNombreDelJugador.setBounds(116, 36, 118, 14);
		getContentPane().add(lblNombreDelJugador);
		
		JLabel lblNombreDelJugador_1 = new JLabel("Nombre del jugador 2");
		lblNombreDelJugador_1.setBounds(116, 163, 118, 14);
		getContentPane().add(lblNombreDelJugador_1);
		
		nj1 = new JTextField();
		nj1.setBounds(116, 61, 158, 20);
		getContentPane().add(nj1);
		nj1.setColumns(10);
		
		nj2 = new JTextField();
		nj2.setBounds(116, 188, 158, 20);
		getContentPane().add(nj2);
		nj2.setColumns(10);
		
		cb1 = new JComboBox<String>();
		cb1.addItem("Peon");
		cb1.addItem("Alfil");
		cb1.addItem("Torre");
		cb1.addItem("Caballo");
		cb1.addItem("Reina");
		cb1.addItem("Rey");
		cb1.setSelectedItem(0);
		cb1.setBounds(116, 92, 158, 20);
		iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) DosJugadores.this.cb1.getSelectedItem();
				if(icono == "Peon")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
				else if(icono == "Alfil")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Alfil.png")));
				else if(icono == "Torre")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Torre.png")));
				else if(icono == "Caballo")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Caballo.png")));
				else if(icono == "Reina")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Reina.png")));
				else if(icono == "Rey")
					iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Rey.png")));
			}
		});
		getContentPane().add(cb1);
		
		cb2 = new JComboBox<String>();
		cb2.addItem("Peon");
		cb2.addItem("Alfil");
		cb2.addItem("Torre");
		cb2.addItem("Caballo");
		cb2.addItem("Reina");
		cb2.addItem("Rey");
		cb2.setSelectedItem(0);
		cb2.setBounds(116, 219, 158, 20);
		iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) DosJugadores.this.cb2.getSelectedItem();
				if(icono == "Peon")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
				else if(icono == "Alfil")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Alfil.png")));
				else if(icono == "Torre")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Torre.png")));
				else if(icono == "Caballo")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Caballo.png")));
				else if(icono == "Reina")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Reina.png")));
				else if(icono == "Rey")
					iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Rey.png")));
			}
		});
		getContentPane().add(cb2);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DosJugadores.class.getResource("grandes/96_Ignorancia.png")));
		lblNewLabel.setBounds(432, 79, 96, 116);
		getContentPane().add(lblNewLabel);
		
		JLabel lblIgnorancia = new JLabel("Ignorancia");
		lblIgnorancia.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgnorancia.setBounds(432, 206, 96, 14);
		getContentPane().add(lblIgnorancia);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DosJugadores.this.frame.CierraTablero();
				DosJugadores.this.dispose();
			}
		});
		btnCancelar.setBounds(10, 307, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnIniciar = new JButton("Iniciar Juego");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(nj1.getText().length() < 1 || nj2.getText().length() < 1)
					JOptionPane.showMessageDialog(DosJugadores.this, "Faltan algunos nombres de jugador", "Error",JOptionPane.ERROR_MESSAGE);
				else
				{
					if(cb1.getSelectedItem() != cb2.getSelectedItem())
					{
						String grande = "";;
						String peque = "";
						String seleccionado = DosJugadores.this.cb1.getSelectedItem().toString(); 
						switch(seleccionado)
						{
							case "Peon" :
								grande = "grandes/96_Peon.png";
								peque =  "peques/34_Peon.png";
								break;
							case "Alfil" :
								grande = "grandes/96_Alfil.png";
								peque =  "peques/34_Alfil.png";
								break;
							case "Torre" :
								grande = "grandes/96_Torre.png";
								peque =  "peques/34_Torre.png";
								break;
							case "Caballo" :
								grande = "grandes/96_Caballo.png";
								peque =  "peques/34_Caballo.png";
								break;
							case "Reina" :
								grande = "grandes/96_Reina.png";
								peque =  "peques/34_Reina.png";
								break;
							case "Rey" : 
								grande = "grandes/96_Rey.png";
								peque =  "peques/34_Rey.png";
								break;
						}
						Jugador uno = new Jugador(nj1.getText(),peque,grande,DosJugadores.this.frame.getKilometros().get(0));
						
						seleccionado = DosJugadores.this.cb2.getSelectedItem().toString(); 
						switch(seleccionado)
						{
							case "Peon" :
								grande = "grandes/96_Peon.png";
								peque =  "peques/34_Peon.png";
								break;
							case "Alfil" :
								grande = "grandes/96_Alfil.png";
								peque =  "peques/34_Alfil.png";
								break;
							case "Torre" :
								grande = "grandes/96_Torre.png";
								peque =  "peques/34_Torre.png";
								break;
							case "Caballo" :
								grande = "grandes/96_Caballo.png";
								peque =  "peques/34_Caballo.png";
								break;
							case "Reina" :
								grande = "grandes/96_Reina.png";
								peque =  "peques/34_Reina.png";
								break;
							case "Rey" : 
								grande = "grandes/96_Rey.png";
								peque =  "peques/34_Rey.png";
								break;
						}
						Jugador dos = new Jugador(nj2.getText(),peque,grande,DosJugadores.this.frame.getKilometros().get(0));
						
						DosJugadores.this.frame.setJugador(uno);
						DosJugadores.this.frame.setJugador(dos);
						/*
						Jugador uno = new Jugador(nj1.getText(),"imgs/34_"+ cb1.getSelectedItem() + ".png","imgs/96_"+ cb1.getSelectedItem() + ".png");
						Jugador dos = new Jugador(nj2.getText(),"imgs/34_"+ cb2.getSelectedItem() + ".png","imgs/96_"+ cb2.getSelectedItem() + ".png");
						DosJugadores.this.frame.setJugador(uno);
						DosJugadores.this.frame.setJugador(dos);
						*/
						DosJugadores.this.dispose();
					}
					else
						JOptionPane.showMessageDialog(DosJugadores.this, "No se pueden repetir los iconos", "Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnIniciar.setBounds(487, 307, 113, 23);
		getContentPane().add(btnIniciar);
	}
}

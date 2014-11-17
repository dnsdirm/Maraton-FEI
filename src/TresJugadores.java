import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class TresJugadores extends JDialog {
	private Tablero frame;
	private final JPanel contentPanel = new JPanel();
	private JTextField nj1;
	private JTextField nj2;
	private JTextField nj3;
	private JLabel iconoJugador1;
	private JLabel iconoJugador2;
	private JLabel iconoJugador3;
	private JComboBox<String> cb1;
	private JComboBox<String> cb2;
	private JComboBox<String> cb3;
	
	@SuppressWarnings("unused")
	private JTextField txtNj;
	private JLabel lblNewLabel;
	private JLabel lblIgnorancia;
	private JLabel lblSeleccionaLaPieza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TresJugadores dialog = new TresJugadores(null);
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
	@SuppressWarnings("unused")
	public TresJugadores(Tablero frame) {
		super(frame);
		this.setModal(true);
		this.frame = frame;
		
		setBounds(100, 100, 668, 494);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
			
			iconoJugador1 = new JLabel("selecciona");
			iconoJugador1.setBounds(10, 45, 96, 116);
			contentPanel.add(iconoJugador1);
			
			iconoJugador2 = new JLabel("selecciona");
			iconoJugador2.setBounds(10, 172, 96, 116);
			contentPanel.add(iconoJugador2);
			
			iconoJugador3 = new JLabel("selecciona");
			iconoJugador3.setBounds(10, 299, 96, 116);
			contentPanel.add(iconoJugador3);
			
			JLabel label1 = new JLabel("ignorancia");

			JLabel label0 = new JLabel("Ignorancia");
			
			cb1 = new JComboBox<String>();
			cb1.addItem("Peon");
			cb1.addItem("Alfil");
			cb1.addItem("Torre");
			cb1.addItem("Caballo");
			cb1.addItem("Reina");
			cb1.addItem("Rey");
			cb1.setSelectedItem(0);
			iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
			cb1.setBounds(116, 112, 144, 20);
			cb1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String icono = (String) TresJugadores.this.cb1.getSelectedItem();
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
			contentPanel.add(cb1);
			
			
			cb2 = new JComboBox<String>();
			cb2.addItem("Peon");
			cb2.addItem("Alfil");
			cb2.addItem("Torre");
			cb2.addItem("Caballo");
			cb2.addItem("Reina");
			cb2.addItem("Rey");
			cb2.setSelectedItem(0);
			iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
			cb2.setBounds(116, 239, 144, 20);
			cb2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String icono = (String) TresJugadores.this.cb2.getSelectedItem();
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
			contentPanel.add(cb2);
			
			cb3 = new JComboBox<String>();
			cb3.addItem("Peon");
			cb3.addItem("Alfil");
			cb3.addItem("Torre");
			cb3.addItem("Caballo");
			cb3.addItem("Reina");
			cb3.addItem("Rey");
			cb3.setSelectedItem(0);
			iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
			cb3.setBounds(116, 366, 144, 20);
			cb3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String icono = (String) TresJugadores.this.cb3.getSelectedItem();
					if(icono == "Peon")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
					else if(icono == "Alfil")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Alfil.png")));
					else if(icono == "Torre")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Torre.png")));
					else if(icono == "Caballo")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Caballo.png")));
					else if(icono == "Reina")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Reina.png")));
					else if(icono == "Rey")
						iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Rey.png")));
				}
			});
			contentPanel.add(cb3);
			
			nj1 = new JTextField();
			nj1.setBounds(116, 81, 144, 20);
			contentPanel.add(nj1);
			nj1.setColumns(10);
			
			nj2 = new JTextField();
			nj2.setBounds(116, 208, 144, 20);
			contentPanel.add(nj2);
			nj2.setColumns(10);
			
			nj3 = new JTextField();
			nj3.setBounds(116, 335, 144, 20);
			contentPanel.add(nj3);
			nj3.setColumns(10);
			
			JLabel lblNombreDelJugador = new JLabel("Nombre del jugador 3");
			lblNombreDelJugador.setBounds(116, 315, 144, 14);
			contentPanel.add(lblNombreDelJugador);
			
			JLabel lblNombreDelJugador_1 = new JLabel("Nombre del jugador 2");
			lblNombreDelJugador_1.setBounds(116, 189, 144, 14);
			contentPanel.add(lblNombreDelJugador_1);
			
			JLabel lblNombreDelJugador_2 = new JLabel("Nombre del jugador 1");
			lblNombreDelJugador_2.setBounds(116, 56, 144, 14);
			contentPanel.add(lblNombreDelJugador_2);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TresJugadores.this.frame.CierraTablero();
					TresJugadores.this.dispose();
				}
			});
			btnCancelar.setBounds(10, 422, 89, 23);
			contentPanel.add(btnCancelar);
			
			JButton btnIniciarJuego = new JButton("Iniciar juego");
			btnIniciarJuego.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(nj1.getText().length() < 1 || nj2.getText().length() < 1 || nj3.getText().length() < 1)
						JOptionPane.showMessageDialog(TresJugadores.this, "Faltan algunos nombres de jugador", "Error",JOptionPane.ERROR_MESSAGE);
					else
					{
						boolean j1 = (cb1.getSelectedItem() == cb2.getSelectedItem() || cb1.getSelectedItem() == cb3.getSelectedItem());
						boolean j2 = (cb2.getSelectedItem() == cb1.getSelectedItem() || cb2.getSelectedItem() == cb3.getSelectedItem());
						boolean j3 = (cb3.getSelectedItem() == cb2.getSelectedItem() || cb3.getSelectedItem() == cb1.getSelectedItem());
						if(!j1 && !j2 && !j3)
						{
							String grande = "";;
							String peque = "";
							String seleccionado = TresJugadores.this.cb1.getSelectedItem().toString(); 
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
							Jugador uno = new Jugador(nj1.getText(),peque,grande,TresJugadores.this.frame.getKilometros().get(0));
							
							seleccionado = TresJugadores.this.cb2.getSelectedItem().toString(); 
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
							Jugador dos = new Jugador(nj2.getText(),peque,grande,TresJugadores.this.frame.getKilometros().get(0));
							
							seleccionado = TresJugadores.this.cb3.getSelectedItem().toString(); 
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
							Jugador tres = new Jugador(nj3.getText(),peque,grande,TresJugadores.this.frame.getKilometros().get(0));
							TresJugadores.this.frame.setJugador(uno);
							TresJugadores.this.frame.setJugador(dos);
							TresJugadores.this.frame.setJugador(tres);							
							TresJugadores.this.dispose();
						}
						else
							JOptionPane.showMessageDialog(TresJugadores.this, "No se pueden repetir los iconos", "Error",JOptionPane.ERROR_MESSAGE);
							
					}
					
				}
			});
			btnIniciarJuego.setBounds(516, 422, 126, 23);
			contentPanel.add(btnIniciarJuego);
			
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(TresJugadores.class.getResource("grandes/96_Ignorancia.png")));
			lblNewLabel.setBounds(422, 97, 96, 116);
			contentPanel.add(lblNewLabel);
			
			lblIgnorancia = new JLabel("Ignorancia");
			lblIgnorancia.setHorizontalAlignment(SwingConstants.CENTER);
			lblIgnorancia.setBounds(422, 223, 96, 14);
			contentPanel.add(lblIgnorancia);
			
			lblSeleccionaLaPieza = new JLabel("Selecciona la pieza de los jugadores y sus nombres");
			lblSeleccionaLaPieza.setHorizontalAlignment(SwingConstants.CENTER);
			lblSeleccionaLaPieza.setBounds(10, 11, 632, 14);
			contentPanel.add(lblSeleccionaLaPieza);
		
	}

}

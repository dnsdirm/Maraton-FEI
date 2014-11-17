import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class CuatroJugadores extends JDialog {
	private Tablero frame;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtJnombre;
	private JTextField txtJnombre_1;
	private JTextField txtJnombre_2;
	private JTextField txtJnombre_3;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JLabel iconoJugador1;
	private JLabel iconoJugador2;
	private JLabel iconoJugador3;
	private JLabel iconoJugador4;
	private JLabel lblIgnorancia;
	private JLabel lblIgonorancia;
	private JButton btnCancelar;
	private JButton btnIniciarJuego;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CuatroJugadores dialog = new CuatroJugadores(null);
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
	public CuatroJugadores(Tablero frame) {
		super(frame);
		this.setModal(true);
		this.frame = frame;
		
		setBounds(100, 100, 717, 538);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
			
			JLabel label1 = new JLabel("New label");
			
			JLabel label2 = new JLabel("Ignorancia");
			
			iconoJugador1 = new JLabel("Selecciona");
			iconoJugador1.setBounds(10, 45, 97, 116);
			contentPanel.add(iconoJugador1);
			
			iconoJugador2 = new JLabel("Selecciona");
			iconoJugador2.setBounds(10, 198, 97, 116);
			contentPanel.add(iconoJugador2);
			
			iconoJugador3 = new JLabel("Selecciona");
			iconoJugador3.setBounds(10, 347, 97, 116);
			contentPanel.add(iconoJugador3);
			
			iconoJugador4 = new JLabel("Selecciona");
			iconoJugador4.setBounds(385, 45, 97, 116);
			contentPanel.add(iconoJugador4);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("Peon");
		comboBox.addItem("Alfil");
		comboBox.addItem("Torre");
		comboBox.addItem("Caballo");
		comboBox.addItem("Reina");
		comboBox.addItem("Rey");
		comboBox.setBounds(117, 93, 130, 20);
		comboBox.setSelectedItem(0);
		iconoJugador1.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		contentPanel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) CuatroJugadores.this.comboBox.getSelectedItem();
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
		
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("Peon");
		comboBox_1.addItem("Alfil");
		comboBox_1.addItem("Torre");
		comboBox_1.addItem("Caballo");
		comboBox_1.addItem("Reina");
		comboBox_1.addItem("Rey");
		comboBox_1.setBounds(117, 246, 130, 20);
		comboBox_1.setSelectedItem(0);
		iconoJugador2.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		contentPanel.add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) CuatroJugadores.this.comboBox_1.getSelectedItem();
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
		
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.addItem("Peon");
		comboBox_2.addItem("Alfil");
		comboBox_2.addItem("Torre");
		comboBox_2.addItem("Caballo");
		comboBox_2.addItem("Reina");
		comboBox_2.addItem("Rey");
		comboBox_2.setBounds(117, 395, 130, 20);
		comboBox_2.setSelectedItem(0);
		iconoJugador3.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		contentPanel.add(comboBox_2);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) CuatroJugadores.this.comboBox_2.getSelectedItem();
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
		
		
		comboBox_3 = new JComboBox<String>();
		
		comboBox_3.addItem("Peon");
		comboBox_3.addItem("Alfil");
		comboBox_3.addItem("Torre");
		comboBox_3.addItem("Caballo");
		comboBox_3.addItem("Reina");
		comboBox_3.addItem("Rey");
		comboBox_3.setBounds(492, 93, 130, 20);
		comboBox_3.setSelectedItem(0);
		iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
		contentPanel.add(comboBox_3);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String icono = (String) CuatroJugadores.this.comboBox_3.getSelectedItem();
				if(icono == "Peon")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Peon.png")));
				else if(icono == "Alfil")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Alfil.png")));
				else if(icono == "Torre")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Torre.png")));
				else if(icono == "Caballo")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Caballo.png")));
				else if(icono == "Reina")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Reina.png")));
				else if(icono == "Rey")
					iconoJugador4.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Rey.png")));				
			}
		});
		
		
		
		
		txtJnombre = new JTextField();
		txtJnombre.setBounds(117, 62, 130, 20);
		contentPanel.add(txtJnombre);
		txtJnombre.setColumns(10);
		
		txtJnombre_1 = new JTextField();
		txtJnombre_1.setBounds(117, 215, 130, 20);
		contentPanel.add(txtJnombre_1);
		txtJnombre_1.setColumns(10);
		
		txtJnombre_2 = new JTextField();
		txtJnombre_2.setBounds(117, 364, 130, 20);
		contentPanel.add(txtJnombre_2);
		txtJnombre_2.setColumns(10);
		
		txtJnombre_3 = new JTextField();
		txtJnombre_3.setBounds(492, 62, 130, 20);
		contentPanel.add(txtJnombre_3);
		txtJnombre_3.setColumns(10);
		
		
		
		JLabel lblNombreJugador = new JLabel("Nombre del jugador 1");
		lblNombreJugador.setBounds(117, 45, 130, 14);
		contentPanel.add(lblNombreJugador);
		
		JLabel lblNombreDelJugador = new JLabel("Nombre del jugador 2");
		lblNombreDelJugador.setBounds(117, 190, 130, 14);
		contentPanel.add(lblNombreDelJugador);
		
		JLabel lblNombreDelJugador_1 = new JLabel("Nombre del jugador 3");
		lblNombreDelJugador_1.setBounds(117, 347, 130, 14);
		contentPanel.add(lblNombreDelJugador_1);
		
		JLabel lblNombreDelJugador_2 = new JLabel("Nombre del jugador 4");
		lblNombreDelJugador_2.setBounds(492, 45, 130, 14);
		contentPanel.add(lblNombreDelJugador_2);
		
		lblIgnorancia = new JLabel("ignorancia");
		lblIgnorancia.setIcon(new ImageIcon(CuatroJugadores.class.getResource("grandes/96_Ignorancia.png")));
		lblIgnorancia.setBounds(525, 201, 97, 116);
		contentPanel.add(lblIgnorancia);
		
		lblIgonorancia = new JLabel("Ignorancia");
		lblIgonorancia.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgonorancia.setBounds(525, 328, 97, 14);
		contentPanel.add(lblIgonorancia);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CuatroJugadores.this.frame.CierraTablero();
				CuatroJugadores.this.dispose();
			}
		});
		btnCancelar.setBounds(10, 466, 89, 23);
		contentPanel.add(btnCancelar);
		
		btnIniciarJuego = new JButton("Iniciar Juego");
		btnIniciarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtJnombre.getText().length() < 1 
						|| txtJnombre_1.getText().length() < 1 
						|| txtJnombre_2.getText().length() < 1
						|| txtJnombre_3.getText().length() < 1)
					JOptionPane.showMessageDialog(CuatroJugadores.this, "Faltan algunos nombres","Error",JOptionPane.ERROR_MESSAGE);
				else
				{
					boolean j1 = (CuatroJugadores.this.comboBox.getSelectedItem() == CuatroJugadores.this.comboBox_1.getSelectedItem() 
							|| CuatroJugadores.this.comboBox.getSelectedItem() == CuatroJugadores.this.comboBox_2.getSelectedItem()
							|| CuatroJugadores.this.comboBox.getSelectedItem() == CuatroJugadores.this.comboBox_3.getSelectedItem());
					
					boolean j2 = (CuatroJugadores.this.comboBox_1.getSelectedItem() == CuatroJugadores.this.comboBox.getSelectedItem() 
							|| CuatroJugadores.this.comboBox_1.getSelectedItem() == CuatroJugadores.this.comboBox_2.getSelectedItem()
							|| CuatroJugadores.this.comboBox_1.getSelectedItem() == CuatroJugadores.this.comboBox_3.getSelectedItem());
					
					boolean j3 = (CuatroJugadores.this.comboBox_2.getSelectedItem() == CuatroJugadores.this.comboBox.getSelectedItem() 
							|| CuatroJugadores.this.comboBox_2.getSelectedItem() == CuatroJugadores.this.comboBox_1.getSelectedItem()
							|| CuatroJugadores.this.comboBox_2.getSelectedItem() == CuatroJugadores.this.comboBox_3.getSelectedItem());
					
					boolean j4 = (CuatroJugadores.this.comboBox_3.getSelectedItem() == CuatroJugadores.this.comboBox.getSelectedItem() 
							|| CuatroJugadores.this.comboBox_3.getSelectedItem() == CuatroJugadores.this.comboBox_1.getSelectedItem()
							|| CuatroJugadores.this.comboBox_3.getSelectedItem() == CuatroJugadores.this.comboBox_2.getSelectedItem());
					if(!j1 && !j2 && !j3 && !j4)
					{
						String grande = "";;
						String peque = "";
						String seleccionado = CuatroJugadores.this.comboBox.getSelectedItem().toString(); 
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
						Jugador uno = new Jugador(txtJnombre.getText(),peque,grande,CuatroJugadores.this.frame.getKilometros().get(0));
						
						seleccionado = CuatroJugadores.this.comboBox_1.getSelectedItem().toString(); 
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
						Jugador dos = new Jugador(txtJnombre_1.getText(),peque,grande,CuatroJugadores.this.frame.getKilometros().get(0));
						
						seleccionado = CuatroJugadores.this.comboBox_2.getSelectedItem().toString(); 
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
						Jugador tres = new Jugador(txtJnombre_2.getText(),peque,grande,CuatroJugadores.this.frame.getKilometros().get(0));
						
						seleccionado = CuatroJugadores.this.comboBox_3.getSelectedItem().toString(); 
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
						Jugador cuatro = new Jugador(txtJnombre_3.getText(),peque,grande,CuatroJugadores.this.frame.getKilometros().get(0));
						
						CuatroJugadores.this.frame.setJugador(uno);
						CuatroJugadores.this.frame.setJugador(dos);
						CuatroJugadores.this.frame.setJugador(tres);
						CuatroJugadores.this.frame.setJugador(cuatro);
						CuatroJugadores.this.dispose();
					}
					else
						JOptionPane.showMessageDialog(CuatroJugadores.this, "No se pueden repetir los iconos","Error",JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btnIniciarJuego.setBounds(556, 466, 136, 23);
		contentPanel.add(btnIniciarJuego);
		
		label = new JLabel("Selecciona la pieza de los jugadores y sus nombres");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 11, 682, 23);
		contentPanel.add(label);
	}
}

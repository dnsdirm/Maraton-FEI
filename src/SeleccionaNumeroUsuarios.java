import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SeleccionaNumeroUsuarios extends JDialog {
	public Tablero frame;
	JRadioButton rdbtnJugadores;
	JRadioButton rdbtnJugadores_1;
	JRadioButton rdbtnJugadores_2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionaNumeroUsuarios dialog = new SeleccionaNumeroUsuarios(null);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionaNumeroUsuarios(Tablero frame) {
		super(frame);
		this.setModal(true);
		this.frame = frame;
		setBounds(100, 100, 701, 438);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SeleccionaNumeroUsuarios.class.getResource("/avatares/equipo2.png")));
		lblNewLabel.setBounds(72, 71, 135, 72);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(SeleccionaNumeroUsuarios.class.getResource("/avatares/avatar.equipo3.png")));
		lblNewLabel_1.setBounds(10, 154, 197, 72);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(SeleccionaNumeroUsuarios.class.getResource("/avatares/avatar.equipo4.png")));
		lblNewLabel_2.setBounds(10, 237, 197, 58);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(SeleccionaNumeroUsuarios.class.getResource("/avatares/avatar.igno.png")));
		lblNewLabel_3.setBounds(464, 71, 151, 162);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeleccionaNumeroUsuarios.this.setVisible(false);
				SeleccionaNumeroUsuarios.this.dispose();
				SeleccionaNumeroUsuarios.this.frame.CierraTablero();
				
			}
		});
		btnInicio.setBounds(10, 363, 89, 23);
		getContentPane().add(btnInicio);
		
		rdbtnJugadores = new JRadioButton("2 Jugadores");
		rdbtnJugadores.setBounds(213, 96, 109, 23);
		getContentPane().add(rdbtnJugadores);
		
		rdbtnJugadores_1 = new JRadioButton("3 Jugadores");
		rdbtnJugadores_1.setBounds(213, 179, 109, 23);
		getContentPane().add(rdbtnJugadores_1);
		
		rdbtnJugadores_2 = new JRadioButton("4 Jugadores");
		rdbtnJugadores_2.setBounds(213, 255, 109, 23);
		getContentPane().add(rdbtnJugadores_2);
		
		JLabel lblSoyLaIgnorancia = new JLabel("Soy la ignorancia");
		lblSoyLaIgnorancia.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoyLaIgnorancia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoyLaIgnorancia.setBounds(464, 237, 151, 23);
		getContentPane().add(lblSoyLaIgnorancia);
		
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnJugadores);
		grupo.add(rdbtnJugadores_1);
		grupo.add(rdbtnJugadores_2);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnJugadores.isSelected())
				{
					SeleccionaNumeroUsuarios.this.frame.setnJugadores(2);
					SeleccionaNumeroUsuarios.this.setVisible(false);
					SeleccionaNumeroUsuarios.this.dispose();
				}
				else if(rdbtnJugadores_1.isSelected())
				{
					SeleccionaNumeroUsuarios.this.frame.setnJugadores(3);
					SeleccionaNumeroUsuarios.this.setVisible(false);
					SeleccionaNumeroUsuarios.this.dispose();
				}
				else if(rdbtnJugadores_2.isSelected())
				{
					SeleccionaNumeroUsuarios.this.frame.setnJugadores(4);
					SeleccionaNumeroUsuarios.this.setVisible(false);
					SeleccionaNumeroUsuarios.this.dispose();
				}
				else
					JOptionPane.showMessageDialog(null,"Debes seleccionar la cantidad de jugadores","Error",JOptionPane.ERROR_MESSAGE);
				
				
			}
		});
		btnContinuar.setBounds(586, 363, 89, 23);
		getContentPane().add(btnContinuar);
	}
}

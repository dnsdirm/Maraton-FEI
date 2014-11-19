import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class Maraton {

	private JFrame frmMaraton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					/* 
					 * Cambia la apariencia que muestra por defecto java 
					 * a la apariencia nativa de windows 
					 */
					javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName()); 	
					/* Crea La ventana principal el menu de inicio y lo vuelve visible */
					Maraton window = new Maraton();		
					window.frmMaraton.setVisible(true);
				} catch (Exception e) {
					/* Muestra el mensaje de error por si ocurrio algo mal dentro del try */
					JOptionPane.showMessageDialog(null,"Ha ocurrido un error : " + e.getMessage(),"Error al inicia", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Maraton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaraton = new JFrame();
		frmMaraton.setResizable(false);
		frmMaraton.setBackground(Color.WHITE);
		frmMaraton.setTitle("Maraton");
		frmMaraton.setBounds(100, 100, 790, 600);
		frmMaraton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icono = new ImageIcon(JFrame.class.getResource("/logo/logo.jpg")).getImage();
		frmMaraton.setIconImage(icono);
		frmMaraton.getContentPane().setLayout(null);
		/* Cuando se presione el boton "instrucciones" */
		/* Cuando se presione el boton "Records" */
		/* Cuando se presione el boton de "Salir"  */
		ImageIcon fot = new ImageIcon(Maraton.class.getResource("/logo/logo.jpg"));
		frmMaraton.repaint();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 572);
		frmMaraton.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblImg = new JLabel("img");
		lblImg.setBounds(179, 101, 406, 353);
		panel.add(lblImg);
		Icon presenta = new ImageIcon(fot.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
		lblImg.setIcon(presenta);
		
		JButton btnNuevoJuego = new JButton("Nuevo Juego");
		btnNuevoJuego.setBounds(10, 498, 179, 45);
		panel.add(btnNuevoJuego);
		
		JButton btnInstrucciones = new JButton("Instrucciones");
		btnInstrucciones.setBounds(199, 498, 179, 45);
		panel.add(btnInstrucciones);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.setBounds(406, 498, 179, 45);
		panel.add(btnRecord);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(595, 498, 179, 45);
		panel.add(btnSalir);
		
		JMenuBar menuBar = new JMenuBar();
		frmMaraton.setJMenuBar(menuBar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDelMaraton = new JMenuItem("Acerca del Maraton de la administracion");
		mntmAcercaDelMaraton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Participantes(Maraton.this.frmMaraton).setVisible(true);
			}
		});
		mnAyuda.add(mntmAcercaDelMaraton);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Elimina la ventana */
				Maraton.this.frmMaraton.dispose();
				/* Cierra Completamente la aplicacion */
				System.exit(0);
			}
		});
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Crea una instancia del JDialog "Records" que se encarga de mostrar los records obtenidos 
				 * se le pasa como parametro el JFrame frmMaraton  para que sea modal 
				 * y se bloquee el JFrame (Maraton) hasta que Instrucciones sea cerrado
				 */ 
				Records rc = new Records(Maraton.this.frmMaraton);
				/*Se vuelve visible el JDialog de recorsds*/
				rc.setVisible(true);
			}
		});
		btnInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Crea una nueva instancia del jdialog "Instrucciones" 
				 * se le pasa como parametro el JFrame frmMaraton  para que sea modal 
				 * y se bloquee el JFrame (Maraton) hasta que Instrucciones sea cerrado 
				 */
				Instrucciones inst = new Instrucciones(Maraton.this.frmMaraton);
				/* Se vuelve visible el jdialog Instrucciones */
				inst.setVisible(true);
			}
		});
		btnNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Tablero(Maraton.this.frmMaraton);
			}
		});
	}
}

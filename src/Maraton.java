import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		frmMaraton.setTitle("Maraton");
		frmMaraton.setBounds(100, 100, 790, 600);
		frmMaraton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaraton.getContentPane().setLayout(null);
		
		JButton btnNuevoJuego = new JButton("Nuevo Juego");
		btnNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Tablero(Maraton.this.frmMaraton);
			}
		});
		btnNuevoJuego.setBounds(10, 507, 182, 44);
		frmMaraton.getContentPane().add(btnNuevoJuego);
		
		JButton btnInstrucciones = new JButton("Instrucciones");
		/* Cuando se presione el boton "instrucciones" */
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
		btnInstrucciones.setBounds(202, 507, 182, 44);
		frmMaraton.getContentPane().add(btnInstrucciones);
		
		JButton btnRecord = new JButton("Record");
		/* Cuando se presione el boton "Records" */
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
		btnRecord.setBounds(394, 507, 187, 44);
		frmMaraton.getContentPane().add(btnRecord);
		
		JButton btnSalir = new JButton("Salir");
		/* Cuando se presione el boton de "Salir"  */
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Elimina la ventana */
				Maraton.this.frmMaraton.dispose();
				/* Cierra Completamente la aplicacion */
				System.exit(0);
			}
		});
		btnSalir.setBounds(591, 507, 173, 44);
		frmMaraton.getContentPane().add(btnSalir);
	}
}

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Instrucciones extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Instrucciones dialog = new Instrucciones(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error al crear el dialogo de Instrucciones","Error",JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Create the dialog.
	 * @param maraton 
	 */
	public Instrucciones(JFrame maraton) {
		super(maraton);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Instrucciones de uso");
		this.setModal(true);
		setBounds(100, 100, 628, 446);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Instrucciones.this.dispose();
			}
		});
		btnAceptar.setBounds(513, 374, 89, 23);
		contentPanel.add(btnAceptar);
		
		JLabel lblparaIniciarUn = new JLabel("<html>1.- Para iniciar un juego nuevo presiona  el boton jugar de la pantalla principal<br>"
												 + "2.- En  la ventana que te aparece indica cuantos jugadores existiran<br>"
												 + "3.- En la siguiente ventana indica los nombres y los iconos de cada jugador<br>"
												 + "4.- El juego te indicar el orden en que se pasaran los turnos<br>"
												 + "5.- Cuando se muestre el tablero completamente da click en el cuadro rosa para <br>"
												 + "     mostrar la pregunta para el jugador en turno<br>"
												 + "6.- Para salir presiona el boton cerrar de la ventana y confirma tu salida");
		lblparaIniciarUn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblparaIniciarUn.setBounds(10, 11, 592, 352);
		contentPanel.add(lblparaIniciarUn);
	}

}

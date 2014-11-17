import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class AvisoSalir extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public Tablero tablero;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AvisoSalir dialog = new AvisoSalir(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param tablero 
	 */
	public AvisoSalir(Tablero tablero) {
		super(tablero);
		this.setModal(true);
		this.tablero = tablero;
		setBounds(100, 100, 599, 406);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAviso = new JLabel("Aviso");
		lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAviso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAviso.setBounds(10, 11, 563, 39);
		contentPanel.add(lblAviso);
		
		JLabel lblestasSeguroQue = new JLabel("\u00BFEstas seguro que deseas salir?");
		lblestasSeguroQue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblestasSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
		lblestasSeguroQue.setBounds(10, 61, 563, 30);
		contentPanel.add(lblestasSeguroQue);
		
		JLabel lblDaClickEn = new JLabel("Da click en el boton continuar para seguir ejecutando el programa");
		lblDaClickEn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDaClickEn.setBounds(10, 118, 563, 30);
		contentPanel.add(lblDaClickEn);
		
		JLabel lblDaClickEn_1 = new JLabel("Da click en el boton salir  para salir del juego actual");
		lblDaClickEn_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDaClickEn_1.setBounds(10, 159, 563, 30);
		contentPanel.add(lblDaClickEn_1);
		
		JButton btnContinuar = new JButton("Continuar");
		/*Cuando se presiona el boton de Continuar*/
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*se auto elimina*/
				AvisoSalir.this.dispose();
			}
		});
		btnContinuar.setBounds(10, 334, 89, 23);
		contentPanel.add(btnContinuar);
		
		JButton btnSalir = new JButton("Salir");
		/* Cuando se presiona el boton salir */
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Cierra el frame tablero que lo mando a llamar */
				AvisoSalir.this.tablero.CierraTablero();
			}
		});
		btnSalir.setBounds(484, 334, 89, 23);
		contentPanel.add(btnSalir);
	}
}

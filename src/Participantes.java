import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Participantes extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Participantes dialog = new Participantes(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param frmMaraton 
	 */
	public Participantes(JFrame frmMaraton) {
		super(frmMaraton);
		this.setModal(true);
		setBounds(100, 100, 551, 495);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(186, 40, 162, 406);
			String participantes = "<html>"
					+ "Alarc�n Solano Angel Daniel<br>"
					+ "Barquet Pav�n Juan Antonio<br>"
					+ "Bello Bustamante David<br>"
					+ "Bola�os Isidro Mariana Denis<br>"
					+ "Del Angel Pimentel Carlos Rafael<br>"
					+ "Garc�a L�pez Guillermo<br>"
					+ "Gonz�lez Z��iga Mariel<br>"
					+ "Guzm�n Cruz Francisco Javier<br>"
					+ "Hern�ndez Aldana Juan Carlos<br>"
					+ "Hern�ndez Rodr�guez Luz Adriana<br>"
					+ "Juan Morales Jos� Luis<br>"
					+ "Licea Avil�s Luis Eduardo<br>"
					+ "Molina Romero Emmanuel Octavio<br>"
					+ "Morales Hern�ndez Juan Carlos<br>"
					+ "Oliva Morales Marlen<br>"
					+ "Olmos Bola�os Daniel<br>"
					+ "Olmos Zepeda Jos� Rodolfo<br>"
					+ "P�rez Dom�nguez No� Alejandro<br>"
					+ "P�rez Laureano Javier<br>"
					+ "Ram�rez D�gante Diego<br>"
					+ "Rojas Luna Alicia Yazm�n<br>"
					+ "Salda�a V�zquez Karla Itzel<br>"
					+ "V�zquez Acosta V�ctor Daniel<br>"
					+ "Villa Garc�a H�ctor<br>";

			contentPanel.setLayout(null);
			lblNewLabel.setText(participantes);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblParticipantes = new JLabel("Creditos");
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(186, 11, 136, 14);
		contentPanel.add(lblParticipantes);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Participantes.this.dispose();
			}
		});
		btnNewButton.setBounds(436, 423, 89, 23);
		contentPanel.add(btnNewButton);
	}
}

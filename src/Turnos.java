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
public class Turnos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Turnos dialog = new Turnos(null,"holas");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Turnos(Tablero t,String turnos) {
		super(t);
		this.setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTurnos = new JLabel("Turnos");
		lblTurnos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTurnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurnos.setBounds(10, 11, 414, 29);
		contentPanel.add(lblTurnos);
		
		JLabel lblEnElSiguiente = new JLabel("En el siguiente orden");
		lblEnElSiguiente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnElSiguiente.setBounds(10, 51, 414, 14);
		contentPanel.add(lblEnElSiguiente);
		
		JLabel lturnos = new JLabel("New label");
		lturnos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lturnos.setBounds(10, 76, 414, 120);
		contentPanel.add(lturnos);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Turnos.this.dispose();
			}
		});
		btnAceptar.setBounds(335, 207, 89, 23);
		contentPanel.add(btnAceptar);
		
		lturnos.setText("<html>" + turnos);
	}
}

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Records extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Records dialog = new Records(null);
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
	public Records(JFrame frmMaraton) {
		super(frmMaraton);
		this.setModal(true);
		
		setTitle("Records");
		setBounds(100, 100, 654, 420);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		
		BaseDeDatos bd = new BaseDeDatos("bdmaraton.db3");
		bd.conectar();
		ResultSet rs = bd.ejecutaConsulta("SELECT nombreUsuario, preguntas FROM records order by preguntas ;");
		
		DefaultTableModel dtm= new DefaultTableModel();
		dtm.addColumn("Numero de preguntas");
		dtm.addColumn("Nombre del jugador");
		//rs.l
		try {
			while(rs.next())
			{
				Object[] newRow = {rs.getString(1),rs.getInt(2)};
				dtm.addRow(newRow);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error constructor : " + this.getClass().toString() + " : " + e.getMessage());
		}
		bd.desconectar();
		
		table = new JTable(dtm);
		table.setBounds(10, 11, 618, 324);
		contentPanel.add(table);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Records.this.dispose();
			}
		});
		btnAceptar.setBounds(539, 346, 89, 23);
		contentPanel.add(btnAceptar);
		
		
	}
}

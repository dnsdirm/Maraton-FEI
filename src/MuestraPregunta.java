import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

import java.awt.Font;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;


public class MuestraPregunta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Tablero tablero;
	private Pregunta p;
	private JButton opca;
	private JButton opcb;
	private JButton opcc;
	private JButton opcd;
	private JLabel tiempo ;
	protected Integer restante;
	private Timer t;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			MuestraPregunta dialog = new MuestraPregunta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 * @param pregunta 
	 * @param turnos 
	 * @param tablero 
	 */
	public MuestraPregunta(Tablero tablero, Jugador turnos, Pregunta pregunta) {
		super(tablero);
		this.setModal(true);
		this.tablero = tablero;
		this.p = pregunta;
		setTitle("Pregunta");
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		opca = new JButton("a");
		opca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MuestraPregunta.this.p.getRespuesta() == 'a')
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta correcta","Bien!",JOptionPane.INFORMATION_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(true);
				}
				else
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta incorrecta","Mal!",JOptionPane.ERROR_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(false);
				}
				MuestraPregunta.this.t.stop();
				MuestraPregunta.this.dispose();
			}
		});
		opca.setBounds(10, 194, 595, 50);
		contentPanel.add(opca);
		
		opcb = new JButton("b");
		opcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MuestraPregunta.this.p.getRespuesta() == 'b')
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta correcta","Bien!",JOptionPane.INFORMATION_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(true);
				}
				else
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta incorrecta","Mal!",JOptionPane.ERROR_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(false);
				}
				MuestraPregunta.this.t.stop();
				MuestraPregunta.this.dispose();
			}
		});
		opcb.setBounds(10, 255, 595, 50);
		contentPanel.add(opcb);
		
		opcc = new JButton("c");
		opcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MuestraPregunta.this.p.getRespuesta() == 'c')
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta correcta","Bien!",JOptionPane.INFORMATION_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(true);
				}
				else
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta incorrecta","Mal!",JOptionPane.ERROR_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(false);
				}
				MuestraPregunta.this.t.stop();
				MuestraPregunta.this.dispose();
			}
		});
		opcc.setBounds(10, 316, 595, 50);
		contentPanel.add(opcc);
		
		opcd = new JButton("d");
		opcd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MuestraPregunta.this.p.getRespuesta() == 'd')
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta correcta","Bien!",JOptionPane.INFORMATION_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(true);
				}
				else
				{
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Respuesta incorrecta ","Mal!",JOptionPane.ERROR_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(false);
				}
				MuestraPregunta.this.t.stop();
				MuestraPregunta.this.dispose();
			}
		});
		opcd.setBounds(10, 373, 595, 50);
		contentPanel.add(opcd);
		
		JLabel lblNombrejugador = new JLabel("nombrejugador");
		lblNombrejugador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombrejugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrejugador.setBounds(10, 11, 595, 38);
		contentPanel.add(lblNombrejugador);
		
		JLabel lblIconojugador = new JLabel("iconoJugador");
		lblIconojugador.setBounds(653, 115, 95, 116);
		contentPanel.add(lblIconojugador);
		
		JProgressBar pbjugador = new JProgressBar(0,42);
		
		pbjugador.setBounds(628, 242, 146, 14);
		contentPanel.add(pbjugador);
		
		tiempo = new JLabel("");
		tiempo.setFont(new Font("Tahoma", Font.PLAIN, 42));
		tiempo.setBounds(653, 36, 121, 68);
		contentPanel.add(tiempo);
		
		JLabel lblIconoignorancia = new JLabel("iconoIgnorancia");
		lblIconoignorancia.setIcon(new ImageIcon(MuestraPregunta.class.getResource("/avatares/avatar.igno.png")));
		lblIconoignorancia.setBounds(628, 267, 146, 156);
		contentPanel.add(lblIconoignorancia);
		
		JProgressBar pbIgnorancia = new JProgressBar(0,42);
		pbIgnorancia.setBounds(628, 437, 146, 14);
		contentPanel.add(pbIgnorancia);
		
		JTextPane prub = new JTextPane();
		prub.setEditable(false);
		prub.setBounds(10, 60, 595, 116);
		contentPanel.add(prub);
		
		prub.setText(pregunta.getPregunta());
		opca.setText(pregunta.getA());
		opcb.setText(pregunta.getB());
		opcc.setText(pregunta.getC());
		opcd.setText(pregunta.getD());
		lblIconojugador.setIcon(turnos.getGrande());
		lblNombrejugador.setText(turnos.getNombre());
		
		pbIgnorancia.setValue(MuestraPregunta.this.tablero.getIgnorancia().getKm().getnKilometro());
		pbjugador.setValue(turnos.getKm().getnKilometro());
		pbIgnorancia.setStringPainted(true);
		pbjugador.setStringPainted(true);
		restante = 15;
		t = new Timer(1000,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				MuestraPregunta.this.tiempo.setText(MuestraPregunta.this.restante.toString());
				if(restante > 0)
				{
					MuestraPregunta.this.restante--;
				}
				else
				{
					MuestraPregunta.this.t.stop();
					JOptionPane.showMessageDialog(MuestraPregunta.this, "Se te acabo el tiempo","Mal!",JOptionPane.ERROR_MESSAGE);
					MuestraPregunta.this.tablero.setRespCorrecta(false);
					MuestraPregunta.this.dispose();
				}
				
			}
			
		});
		t.start();
	}
}

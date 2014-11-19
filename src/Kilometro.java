import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author dnsdirm
 *
 */
@SuppressWarnings("serial")
public class Kilometro extends JPanel {
	private Integer nKilometro;
	private JLabel eti;
	private Tablero t;
	
	/**
	 * @return Retorna el numero de kilometro del Kilometro actual
	 */
	public int getnKilometro() {
		return nKilometro;
	}
	/**
	 * Constructor del kilometro
	 * @param kilometro que sera el panel
	 * @param numero de color que tendra el panel de fondo
	 */
	public Kilometro(Tablero t,int nKilometro, Color color)
	{
		this.t = t;
		this.nKilometro = nKilometro;
		this.setBackground(color);
		if(nKilometro != 0 && nKilometro < 42)
			this.add(eti = new JLabel(this.nKilometro.toString()));
		if(nKilometro == 42)
			this.add(eti = new JLabel("Meta"));
		if(nKilometro == 48)
		{
			this.setBackground(new Color(255,20,147));
			this.addMouseListener( new MouseListener(){
					@Override
					public void mouseClicked(MouseEvent arg0) {
						//JOptionPane.showMessageDialog(null, "Holas");
						Kilometro.this.eti.setText("Siguiente Turno");
						Kilometro.this.t.siguienteTurno();
					}
					@Override
					public void mouseEntered(MouseEvent arg0) {}
					@Override
					public void mouseExited(MouseEvent arg0) {}
					@Override
					public void mousePressed(MouseEvent arg0) {}
					@Override
					public void mouseReleased(MouseEvent arg0) {}
				}	
			);
			this.add(eti = new JLabel("Empezar a jugar"));
		}
	}

}

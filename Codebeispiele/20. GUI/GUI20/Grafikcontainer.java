import javax.swing.JPanel;
import java.awt.Graphics;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(50, 50, 100, 50);
	}
}
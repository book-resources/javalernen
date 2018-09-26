import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawOval(50, 50, 50, 50);
		g.fillOval(100, 50, 20, 20);
	}
}
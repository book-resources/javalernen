import javax.swing.JPanel;
import java.awt.Graphics;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int[] xPoints = { 20, 50, 75, 100, 20 };
		int[] yPoints = { 20, 20, 50, 50, 20 };
		g.drawPolygon(xPoints, yPoints, 5);
	}
}
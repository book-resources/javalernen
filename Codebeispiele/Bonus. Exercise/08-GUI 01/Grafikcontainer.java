import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(this.getWidth()/2, this.getHeight()/2, 1, 1);
	}
}
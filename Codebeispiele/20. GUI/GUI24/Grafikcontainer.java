import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Serif", Font.PLAIN, 20));
		g.drawString("Hallo Welt!", 20, 20);
	}
}
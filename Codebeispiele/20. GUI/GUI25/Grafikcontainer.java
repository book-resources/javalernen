import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Grafikcontainer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage image;
		try {
			image = ImageIO.read(new File("apfel.jpg"));
			g.drawImage(image, 0, 0, null);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
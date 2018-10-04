import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;

public class Grafikcontainer extends JPanel {
	private int xPos;
	private int yPos;

	public Grafikcontainer() {
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					yPos--;
				}
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					xPos++;
				}
				else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					xPos--;
				}
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					yPos++;
				}
				repaint();
			}
		});

		this.setFocusable(true);
		this.requestFocusInWindow();
	}

	public void setStartPosition(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(xPos, yPos, 4, 4);
	}
}
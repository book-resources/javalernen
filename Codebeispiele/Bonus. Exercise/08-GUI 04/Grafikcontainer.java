import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

public class Grafikcontainer extends JPanel {
	private int xPos;
	private int yPos;
	private boolean[] r = new boolean[4];
	private Color color = Color.RED;

	public Grafikcontainer() {
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) r[0] = false;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) r[1] = false;
				if (e.getKeyCode() == KeyEvent.VK_LEFT) r[2] = false;
				if (e.getKeyCode() == KeyEvent.VK_DOWN) r[3] = false;
				updatePosition();
			}
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) r[0] = true;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) r[1] = true;
				if (e.getKeyCode() == KeyEvent.VK_LEFT) r[2] = true;
				if (e.getKeyCode() == KeyEvent.VK_DOWN) r[3] = true;
				updatePosition();
			}
		});
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				Random rand = new Random();
				color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
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

	private void updatePosition() {
		if (r[0]) { yPos--; }
		if (r[1]) { xPos++; }
		if (r[2]) { xPos--; }
		if (r[3]) { yPos++; }
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(xPos, yPos, 4, 4);
	}
}
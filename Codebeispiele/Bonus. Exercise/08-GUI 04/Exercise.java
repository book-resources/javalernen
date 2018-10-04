import javax.swing.*;

public class Exercise {
	public static final int BREITE = 200;
	public static final int HOEHE = 200;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.pack();
		Grafikcontainer container = new Grafikcontainer();
		int startX = (BREITE - f.getInsets().left - f.getInsets().right) / 2;
		int startY = (HOEHE - f.getInsets().top - f.getInsets().bottom) / 2;
		container.setStartPosition(startX, startY);
		f.add(container);
		f.setSize(BREITE, HOEHE);
		f.setVisible(true);
		f.repaint();
	}
}
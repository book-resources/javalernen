import javax.swing.*;

public class Exercise {
	public static final int BREITE = 200;
	public static final int HOEHE = 200;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(BREITE, HOEHE);
		f.setLocationRelativeTo(null);
		f.add(new Grafikcontainer());
		f.setVisible(true);
		f.repaint();
	}
}
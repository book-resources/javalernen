import javax.swing.*;
				
public class Main {
	public static void main( String args[] ) {
		JFrame f = new JFrame("Fenstertitel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setzt die Fenstergroesse
		f.setSize(600, 400); 
		// zentriert Fenster auf dem Bildschirm
		f.setLocationRelativeTo(null); 
		f.setVisible(true);
	}
}
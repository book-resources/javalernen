import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
				
public class Main {
	public static void main(String args[]) {
		JFrame f = new JFrame("Fenstertitel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 400); 
		f.setLocationRelativeTo(null); 
		f.setLayout(null);
		f.setVisible(true);
		
		JLabel text = new JLabel("Hallo Welt");
		text.setBounds(15, 15, 100, 100);
		// setzt den Inhalt des Labels
		text.setText("Hallo!");
		// setzt die Schriftart 
		text.setFont(new Font("Arial", Font.PLAIN, 16)); 
		// setzt die Schriftfarbe
		text.setForeground(Color.BLUE); 
		text.setVisible(true);
		f.add(text);
		
		f.repaint();
	}
}
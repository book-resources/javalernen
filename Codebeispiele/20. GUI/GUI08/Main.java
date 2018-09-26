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
		
		JButton button = new JButton("Klick mich!");
		button.setBounds(15, 15, 100, 25);
		button.setVisible(true);
		f.add(button);
		
		f.repaint();
	}
}
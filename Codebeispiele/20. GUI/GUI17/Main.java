import javax.swing.*;
import java.awt.BorderLayout;
					
public class Main {					
	public static void main(String args[]) {
		JFrame f = new JFrame("Titel des Fensters");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200); 
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout());
		f.setVisible(true);
		
		JButton button1 = new JButton("Oben");
		button1.setVisible(true);
		f.add(button1, BorderLayout.PAGE_START);

		JButton button2 = new JButton("Links");
		button2.setVisible(true);
		f.add(button2, BorderLayout.LINE_START);

		JButton button3 = new JButton("Mitte");
		button3.setVisible(true);
		f.add(button3, BorderLayout.CENTER);

		JButton button4 = new JButton("Rechts");
		button4.setVisible(true);
		f.add(button4, BorderLayout.LINE_END);

		JButton button5 = new JButton("Unten");
		button5.setVisible(true);
		f.add(button5, BorderLayout.PAGE_END);

		f.repaint();
	}
}
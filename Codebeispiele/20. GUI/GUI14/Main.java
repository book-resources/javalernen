import javax.swing.*;
import java.awt.FlowLayout;
					
public class Main {					
	public static void main(String args[]) {
		JFrame f = new JFrame("Titel des Fensters");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200); 
		f.setLocationRelativeTo(null); 
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		JButton button1 = new JButton("Button1");
		button1.setVisible(true);
		f.add(button1);

		JButton button2 = new JButton("Button2");
		button2.setVisible(true);
		f.add(button2);

		JButton button3 = new JButton("Button3");
		button3.setVisible(true);
		f.add(button3);
		
		f.repaint();
	}
}
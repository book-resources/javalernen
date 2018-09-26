import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
					
public class Main {					
	public static void main(String args[]) {
		JFrame f = new JFrame("Titel des Fensters");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200); 
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout());
		f.setVisible(true);
		
		JButton b1 = new JButton("Links");
		b1.setVisible(true);
		f.add(b1, BorderLayout.LINE_START);

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.setVisible(true);

		JButton b2= new JButton("Innen links");
		b2.setVisible(true);
		p.add(b2, BorderLayout.LINE_START);
		JButton b3 = new JButton("Innen rechts");
		b3.setVisible(true);
		p.add(b3, BorderLayout.LINE_START);

		f.add(p, BorderLayout.CENTER);

		JButton b4 = new JButton("Rechts");
		b4.setVisible(true);
		f.add(b4, BorderLayout.LINE_END);

		JButton b5 = new JButton("Unten");
		b5.setVisible(true);
		f.add(b5, BorderLayout.PAGE_END);

		f.repaint();
	}
}
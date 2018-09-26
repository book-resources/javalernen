import javax.swing.*;
					
public class Main {					
	public static void main(String args[]) {
		JFrame f = new JFrame("Fenstertitel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 400); 
		f.setLocationRelativeTo(null); 
		f.setLayout(null);
		f.setVisible(true);
		
		JButton b = new JButton("Klick mich!");
		b.setBounds(15, 15, 100, 25);
		b.setVisible(true);
		b.addActionListener(new ButtonHandler());
		f.add(b);
		
		f.repaint();
	}
}
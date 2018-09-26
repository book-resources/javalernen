import javax.swing.*;
				
public class Main {
	public static void main(String args[]) {
		JFrame f = new JFrame("Fenstertitel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 400); 
		f.setLocationRelativeTo(null);
		f.setLayout(null); 
		f.setVisible(true);
		
		// Label wie gewohnt definieren
		JLabel label1 = new JLabel("Hallo");
		label1.setBounds(20, 20, 30, 30);
		label1.setVisible(true);
		JLabel label2 = new JLabel("Welt");
		label2.setBounds(55, 20, 30, 30);
		label2.setVisible(true);
		
		// JPanel ueberdeckt den gesamten JFrame
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 400);
		panel.setLayout(null);
		panel.add(label1);
		panel.add(label2);
		panel.setVisible(true);
		
		f.add(panel);
		f.repaint();
	}
}
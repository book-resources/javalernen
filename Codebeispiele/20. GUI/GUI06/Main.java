import javax.swing.*;
				
public class Main {
	public static void main(String args[]) {
		JFrame f = new JFrame("Fenstertitel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 400); 
		f.setLocationRelativeTo(null); 
		f.setLayout(null);
		f.setVisible(true);
		
		JComboBox<String> box = new JComboBox<String>(new String[]{ "Apfel", "Banane", "Birne" });
		box.setBounds(40, 25, 100, 25);
		box.setVisible(true);
		f.add(box);
		
		f.repaint();
	}
}
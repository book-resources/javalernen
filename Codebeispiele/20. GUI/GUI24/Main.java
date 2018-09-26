import javax.swing.*;
					
public class Main {					
	public static void main(String args[]) {
		JFrame f = new JFrame("Titel des Fensters");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200);
		f.setLocationRelativeTo(null);
		f.add(new Grafikcontainer());
		f.setVisible(true);
	}
}
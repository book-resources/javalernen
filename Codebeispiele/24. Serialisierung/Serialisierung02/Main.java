import java.io.*;

public class Main {					
	public static void main(String args[]) {
		Mensch m1 = deserialize("m1.ser");
		Mensch m2 = deserialize("m2.ser");

		System.out.printf("m1: %s %s, %d, %s \r\n", m1.vorname, m1.name, m1.alter, m1.geschlecht);
		System.out.printf("m2: %s %s, %d, %s", m2.vorname, m2.name, m2.alter, m2.geschlecht);
	}
	public static Mensch deserialize(String filename) {
		Mensch m = null;
		try {
			FileInputStream fIn = new FileInputStream(filename);
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			m = (Mensch) oIn.readObject();
			oIn.close();
			fIn.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return m;
	}
}
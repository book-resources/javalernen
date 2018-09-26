import java.io.*;

public class Main {					
	public static void main(String args[]) {
		Mensch m1 = new Mensch("Mustermann", "Max", 35, "maennlich");
		Mensch m2 = new Mensch("Musterfrau", "Erika", 26, "weiblich");

		serialize(m1, "m1.ser");
		serialize(m2, "m2.ser");
	}
	public static void serialize(Mensch m, String filename) {
		try {
			FileOutputStream fOut = new FileOutputStream(filename);
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(m);
			oOut.close();
			fOut.close();
			System.out.println("Serialisierung erfolgreich!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
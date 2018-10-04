import java.io.*;

public class Exercise {
	public static void main(String[] args) {
		String pfad = "test.txt";
		String text = "Dieser Text wird in die Datei geschrieben.";

		Exercise.schreibeInTextdatei(pfad, text);

		String inhalt = Exercise.leseAusTextdatei(pfad);
		System.out.println(inhalt);
	}
	static void schreibeInTextdatei(String pfad, String text) {
		Writer writer = null;
		try {
			writer = new FileWriter(pfad, true);
			writer.write(text);
			writer.write(System.getProperty("line.separator"));
		}
		catch (IOException e) {
			System.err.println("Fehler beim Schreiben!");
			e.printStackTrace();
		}
		finally {
			if (writer != null) {
				try {
					writer.close();
				} 
				catch (IOException e) {
					System.err.println("Fehler beim Schliessen!");
					e.printStackTrace();
				}
			}
		}
	}
	static String leseAusTextdatei(String pfad) {
		Reader reader = null;
		String text = "";
		try {
			reader = new FileReader(pfad);
			for (int c; (c = reader.read()) != -1;) {
				text += (char) c;
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Lesen!");
			e.printStackTrace();
		}
		finally {
			if (reader != null) {
				try {
					reader.close();
				} 
				catch (IOException e) {
					System.err.println("Fehler beim Schliessen!");
					e.printStackTrace();
				}
			}
		}
		return text;
	}
}
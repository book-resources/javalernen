import java.io.*;
				
public class Main {
	Writer writer;
	public static void main(String args[]) {
		Main obj = new Main();
		obj.write("hallo.txt");
	}
	void write(String pfad) {
		try {
			writer = new FileWriter(pfad);
			writer.write("Hallo Welt!");
		}
		catch (IOException e) {
			System.err.println("Fehler beim Schreiben!");   
		}
		finally {
			if (writer != null) {
				try { 
					writer.close(); 
				}
				catch (IOException e) {
					System.err.println("Schliessen misslungen");
				}
			}
		}
	}
}
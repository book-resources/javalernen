import java.io.*;
				
public class Main {
	Reader reader;
	
	public static void main(String args[]) {
		Main obj = new Main();
		obj.write("hallo.txt");
	}
	
	void write(String pfad) {
		try {
			reader = new FileReader(pfad);
			for(int c; (c = reader.read()) != -1;) {
				System.out.print((char)c);
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Lesen!");   
		}
		finally {
			if (reader != null) {
				try { 
					reader.close(); 
				}
				catch (IOException e) {
					System.err.println("Schliessen misslungen");  
				}
			}
		}
	}
}
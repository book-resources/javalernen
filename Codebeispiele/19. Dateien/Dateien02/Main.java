import java.io.*;
				
public class Main {
	public static void main(String args[]) {
		File f = new File("C:\\Beispielprojekt");
		String[] files = f.list();
		
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i] + " || ");
		}
	}
}
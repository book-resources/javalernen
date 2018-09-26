import java.io.*;
				
public class Main {
	public static void main(String args[]) {
		File f = new File("apfel.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.print(f.exists() + ", ");
		System.out.print(f.isDirectory() + ", ");
		System.out.print(f.isFile() + ", ");
		System.out.print(f.canRead() + ", ");
		System.out.print(f.canWrite() + ", ");
		System.out.print(f.length());
	}
}
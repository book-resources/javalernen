import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Wie lautet Ihr Name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.println("Ihr Name lautet also " + name);
	}
}
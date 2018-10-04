import java.util.Scanner;

public class Exercise {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		String antwort = "";
		while (!antwort.equals("y") && !antwort.equals("Y")) {
			System.out.println("Geben Sie Ihren Namen ein.");
			String name = scanner.next();
			System.out.printf("Ihr Name lautet also %s.%n", name);
			System.out.println("Ist das korrekt? (Y/N)");

			antwort = scanner.next();
		}
		System.out.println("Eingabe wurde bestaetigt.");
		scanner.close();
	}
}
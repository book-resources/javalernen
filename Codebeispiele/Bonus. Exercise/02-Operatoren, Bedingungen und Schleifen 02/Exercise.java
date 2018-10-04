import java.util.Scanner;

public class Exercise {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie Ihren Namen ein.");
		String name = scanner.next();
		
		System.out.printf("Ihr Name lautet also %s.%n", name);
		System.out.println("Ist das korrekt? (Y/N)");
		
		String antwort = scanner.next();
		scanner.close();

		if (antwort.equals("y") || antwort.equals("Y")) {
			System.out.println("Sie haben Ihre Eingabe bestaetigt.");
		}
		else if (antwort.equals("n") || antwort.equals("N")) {
			System.out.println("Ihre Eingabe war nicht korrekt.");
		}
		else {
			System.out.println("Ungueltige Eingabe.");
		}
	}
}
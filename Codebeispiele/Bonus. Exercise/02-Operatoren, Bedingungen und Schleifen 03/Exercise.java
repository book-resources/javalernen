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
			while (!antwort.equals("y") && !antwort.equals("Y") &&
					!antwort.equals("n") && !antwort.equals("N")) {
				System.out.println("Bestaetigen Sie mit 'Y' oder kehren Sie mit 'N' zur Eingabe zurueck");
				antwort = scanner.next();
			}
		}
		System.out.println("Eingabe wurde bestaetigt.");
		scanner.close();
	}
}
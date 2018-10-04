import java.util.Scanner;

public class Exercise {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die erste Zahl ein.");
		int zahl1 = scanner.nextInt();

		System.out.println("Geben Sie die zweite Zahl ein.");
		int zahl2 = scanner.nextInt();

		scanner.close();
		if (zahl1 == zahl2) {
			System.out.printf("%d=%d", zahl1, zahl2);
		}
		else {
			System.out.printf("%d!=%d", zahl1, zahl2);
		}
	}
}
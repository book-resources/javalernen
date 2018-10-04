import java.util.Scanner;

public class Exercise {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die erste Zahl ein.");
		int zahl1 = scanner.nextInt();

		System.out.println("Geben Sie die zweite Zahl ein.");
		int zahl2 = scanner.nextInt();

		scanner.close();
		System.out.printf("%d*%d = %d", zahl1, zahl2, zahl1 * zahl2);
	}
}
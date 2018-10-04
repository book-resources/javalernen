import java.lang.ArithmeticException;

public class Exercise {
	public static void main(String[] args) {
		try {
			// Gueltige Eingabe
			System.out.println(Exercise.dividieren(10, 2));

			// Fehlerhafte Eingabe
			System.out.println(Exercise.dividieren(10, 0));
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Programm laeuft weiter.");
	}
	static double dividieren(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		else {
			return a / b;
		}
	}
}
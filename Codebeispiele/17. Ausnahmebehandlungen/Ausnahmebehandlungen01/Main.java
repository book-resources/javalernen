public class Main {
	public static void main(String args[]) {
		try {
			System.out.println(dividiere(10, 0));
		}
		catch (ArithmeticException e) {
			System.out.println("Es wurde durch 0 geteilt!");
		}
	}
	// Eine Methode zur Division zweier Zahlen
	public static double dividiere(int dividend, int divisor)  {
		return dividend / divisor;
	}
}
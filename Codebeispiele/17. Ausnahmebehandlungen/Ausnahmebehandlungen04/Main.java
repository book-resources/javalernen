public class Main {
	public static void main(String args[]) {
		try {
			System.out.println(dividiere(10, 5));
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	public static double dividiere(int dividend, int divisor)  {
		return dividend / divisor;
	}
}
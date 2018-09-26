public class Main {
	public static void main(String args[]) {
		try {
			System.out.println(dividiere(10, 0));
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Dies wird immer ausgefuehrt!");
		}
	}
	public static double dividiere(int dividend, int divisor)  {
		return dividend / divisor;
	}
}
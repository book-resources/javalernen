public class Main {
	public static void main(String args[]) {
		try {
			System.out.println(dividiere(10, 2));
		}
		catch (ArithmeticException e) {
			System.out.println("Es wurde durch Null geteilt!");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Ein weiterer catch-Block!");
		}
		finally {
			System.out.println("Dies wird immer ausgefuehrt!");
		}
	}
	public static double dividiere(int dividend, int divisor) {
		return dividend / divisor;
	}
}
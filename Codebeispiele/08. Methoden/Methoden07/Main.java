public class Main {
	public static void main(String args[]) {
		System.out.println(addieren(5, 15));
		System.out.println(addieren(5, 15, 25));
		schreiben(5);
		schreiben(5.5);
	}
	static void schreiben(int a) {
		System.out.println("int: " + a);
	}
	static void schreiben(double a) {
		System.out.println("double: " + a);
	}
	static int addieren(int a, int b) {
		return a + b;
	}
	static int addieren(int a, int b, int c) {
		return a + b + c;
	}
}
public class Exercise {
	public static void main(String[] args) {
		Exercise obj = new Exercise();

		System.out.println(obj.addieren(10, 10));
		System.out.println(obj.addieren(10, 10, 10));
		System.out.println(obj.addieren(10, 10, 10, 10));
	}
	int addieren(int a, int b) {
		return a + b;
	}
	int addieren(int a, int b, int c) {
		return a + b + c;
	}
	int addieren(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
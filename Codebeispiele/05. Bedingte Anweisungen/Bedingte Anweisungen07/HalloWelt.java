public class HalloWelt {
	public static void main(String args[]) {
		int a = 10;
		int b = 10;
		int c = 20;
		int d = 5;
		if (a < c) {
			System.out.println("a < c");
			if (a < b) {
				System.out.println("a < b");
				if (d < c) {
					System.out.println("d < c");
				}
			}
			else if (a > b) {
				System.out.println("a > b");
				if (d < c) {
					System.out.println("d < c");
				}
			}
			else {
				System.out.println("a == b");
				if (d < c) {
					System.out.println("d < c");
				}
			}
		}
		else if (a < d) {
			System.out.println("a < d");
		}
		else {
			System.out.println("a >= c && a >= d");
		}
	}
}
public class HalloWelt {
	public static void main(String args[]) {
		int a = 0;
		while (a < 5) {             
			if (a == 3) {
				System.out.println("Schleife beendet.");
				break;
			}
			a++;
			System.out.println(a);
		}
	}
}
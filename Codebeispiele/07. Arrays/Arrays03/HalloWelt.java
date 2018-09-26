public class HalloWelt {
	public static void main(String args[]) {
		// Dem Array Werte zuweisen
		int[] zahlen = new int[10];
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i;
		}
		// Das komplette Array ausgeben
		for (int i : zahlen) {
			System.out.print(zahlen[i] + " ");
		}
	}
}
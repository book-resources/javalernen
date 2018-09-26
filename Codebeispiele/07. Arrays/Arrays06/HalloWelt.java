public class HalloWelt {
	public static void main(String args[]) {
		int[][] zahlen = { {1, 2}, {3, 4}, {5, 6} };
		for (int[] i : zahlen) {
			for (int j : i) {
				System.out.print(j + " ");
			}
		}
	}
}
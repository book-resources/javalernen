public class Main {
	public static void main(String args[]) {
		try {
			Zahlen objekt = new Zahlen(new int[] { 3, 53, 76, 64, 86 });
			// Hierbei entsteht nun eine Ausnahme
			objekt.getIndex(-1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
public class Exercise {
	public static void main(String[] args) {
		Exercise.test(5);
		Exercise.test(5.0);
		Exercise.test(true);
		Exercise.test(new Exercise());
		Exercise.test(new Character('a'));
	}
	static <E> void test(E input) {
		System.out.print("Der Datentyp ist ");
		if (input instanceof Integer) {
			System.out.println("int.");
		}
		else if (input instanceof Float) {
			System.out.println("float.");
		}
		else if (input instanceof Double) {
			System.out.println("double.");
		}
		else if (input instanceof Boolean) {
			System.out.println("boolean.");
		}
		else if (input instanceof Character) {
			System.out.println("char.");
		}
		else if (input instanceof String) {
			System.out.println("String.");
		}
		else {
			System.out.println("unbekannt.");
		}
	}
}
public class Main {					
	public static void main(String args[]) {
		schreiben(5);
		schreiben("Hallo Welt");
		schreiben(true);
	}
	public static <E> void schreiben(E input) {
		System.out.println(input);
	}
}
public class Main {					
	public static void main(String args[]) {
		System.out.println(schreiben(5));
		System.out.println(schreiben("Hallo Welt"));
		System.out.println(schreiben(true));
	}
	public static <E> E schreiben(E input) {
		return input;
	}
}
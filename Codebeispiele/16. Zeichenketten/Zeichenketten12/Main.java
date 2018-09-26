public class Main {
	public static void main(String args[]) {
		String a = "Hallo";
		System.out.println(a.indexOf("l"));
		// beginnt an Position 3
		System.out.println(a.indexOf("a", 3)); 
		System.out.println(a.lastIndexOf("l"));
		// ab Position 3 rueckwaerts
		System.out.println(a.lastIndexOf("a", 3)); 
	}
}
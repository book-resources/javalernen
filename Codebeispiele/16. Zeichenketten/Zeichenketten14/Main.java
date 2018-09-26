public class Main {
	public static void main(String args[]) {
		String a = "Hallo";
		String b = "Welt";       
		System.out.println(a.startsWith("Hallo"));
		System.out.println(a.endsWith("Hallo"));
		System.out.println(a.concat(b));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println("  hallo    ".trim());
		System.out.println(a.replace("a", "e"));
	}
}
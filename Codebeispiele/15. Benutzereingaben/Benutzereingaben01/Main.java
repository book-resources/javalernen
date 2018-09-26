public class Main {
	public static void main(String args[]) {
		System.out.println("Wie lautet Ihr Name?");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.println("Ihr Name lautet also " + name);
	}
}
public class HalloWelt {
	public static void main(String args[]) {
		char zeichen = 'a';
		switch (zeichen) {
		case 'a':
			System.out.println("Das Zeichen lautet 'a'");
			break;
		case 'b':
			System.out.println("Das Zeichen lautet 'b'");
			break;
		default:
			System.out.println("Zeichen nicht gefunden");
			break;
		}
	}
}
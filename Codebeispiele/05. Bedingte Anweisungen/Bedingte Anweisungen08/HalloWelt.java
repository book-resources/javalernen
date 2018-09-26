public class HalloWelt {
	public static void main(String args[]) {
		int monat = 2;
		switch (monat) {
		case 1:
			System.out.println("Wir haben Januar.");
			break;
		case 2:
			System.out.println("Wir haben Februar.");
			break;
		case 3:
			System.out.println("Wir haben Maerz.");
			break;
		default:
			System.out.println("Monat nicht gefunden.");
			break;
		}
	}
}
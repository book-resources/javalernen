public class HalloWelt {
	public static void main(String args[]) {
		// Parameterloser Konstruktor
		Haustier katze = new Haustier();
		// Attribute des ersten Objekts ausgeben
		System.out.println("Werte von katze: " + katze.name + ", " + katze.alter + ", " + katze.tierart);
		// Zweiter Konstruktor
		Haustier hund = new Haustier("Bello", 2, "Hund");
		// Attribute des zweiten Objekts ausgeben
		System.out.println("Werte von hund: " + hund.name +", " + hund.alter + ", " + hund.tierart);
	}
}
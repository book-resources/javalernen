public class HalloWelt {
	public static void main(String args[]) {
		Haustier katze = new Haustier("Alma", 3, "Katze");
		Haustier hund = new Haustier("Bello", 2, "Hund");
		
		// Attribute des ersten Objektes ausgeben
		System.out.println("Werte von katze: " + katze.name + ", " + katze.alter + ", " + katze.tierart);
		// Attribute des zweiten Objektes ausgeben
		System.out.println("Werte von hund: " + hund.name +", " + hund.alter + ", " + hund.tierart);
	}
}
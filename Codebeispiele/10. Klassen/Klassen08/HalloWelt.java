public class HalloWelt {
	public static void main(String args[]) {
		System.out.println("Anzahl Haustiere: " + Haustier.anzahlHaustiere);
		Haustier katze = new Haustier("Alma", 3, "Katze");
		Haustier hund = new Haustier("Bello", 2, "Hund");
		System.out.println("Anzahl Haustiere: " + Haustier.anzahlHaustiere);
		
		// Attribute des ersten Objekts ausgeben
		System.out.println("Werte von katze: " + katze.name + ", " + katze.alter + ", " + katze.tierart);
		// Attribute des zweiten Objekts ausgeben
		System.out.println("Werte von hund: " + hund.name +", " + hund.alter + ", " + hund.tierart);
	}
}
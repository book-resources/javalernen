public class Main {
	public static void main(String args[]) {
		// Zugriff ueber die Elternklasse
		System.out.println("Anzahl Haustiere: " + Haustier.anzahlHaustiere);

		Hund hund = new Hund("bello", 2);

		// Zugriff ueber die Kindklasse
		System.out.println("Anzahl Haustiere: " + Hund.anzahlHaustiere);
		
		// Werte vom Objekt hund ausgeben
		System.out.println("Name von hund: " + hund.name);
		System.out.println("Alter von hund: " + hund.alter);
		System.out.println("Tierart von hund: " + hund.tierart);
	}
}
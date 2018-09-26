public class HalloWelt {
	public static void main(String args[]) {
		// Objekt der neuen Klasse
		NeueKlasse obj = new NeueKlasse();
		// Zugriff ist nun nicht mehr moeglich
		// FEHLER!
		System.out.println(obj.privateVar);
	}
}
// Wir erstellen uns eine neue Klasse
class NeueKlasse {
	// Private Variable in der neuen Klasse
	private int privateVar = 10;
}
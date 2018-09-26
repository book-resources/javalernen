public class HalloWelt {
	public static void main(String args[]) {
		// Objekt der neuen Klasse
		NeueKlasse o = new NeueKlasse();
		// Zugriff auf oeffentliche Variable
		System.out.println(o.oeffentlicheVar);
	}
}
// Wir erstellen uns eine neue Klasse
class NeueKlasse {
	// Oeffentliche Variable in der neuen Klasse
	public int oeffentlicheVar = 10;
}
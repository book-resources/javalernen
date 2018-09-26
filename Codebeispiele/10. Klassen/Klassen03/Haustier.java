public class Haustier {
	public String name;
	public int alter;
	public String tierart;
	
	// Parameterloser Konstruktor
	public Haustier() {
		System.out.println(
			"Neues Haustier-Objekt erstellt.");
	}
	// Konstruktor mit Parametern
	public Haustier(String name_, int alter_, String tierart_) {
		name = name_;
		alter = alter_;
		tierart = tierart_;
		System.out.println(
			"Objekt erzeugt, Werte zugewiesen.");
	}
}
public class Haustier {
	public static String name;
	public int alter;
	public String tierart;
	
	// Konstruktor mit Parametern
	public Haustier(String name, int alter, String tierart) {
		// moeglich, aber fuer statische
		// Variablen besser kein "this" nutzen
		this.name = name; 
		this.alter = alter;
		this.tierart = tierart;
	}
}
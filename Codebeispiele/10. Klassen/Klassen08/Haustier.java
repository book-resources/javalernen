public class Haustier {
	public static int anzahlHaustiere = 0;
	public String name;
	public int alter;
	public String tierart;
	
	// Konstruktor mit Parametern
	public Haustier(String name, int alter, String tierart) {
		this.name = name;
		this.alter = alter;
		this.tierart = tierart;
		anzahlHaustiere++;
	}
}
class Zahlen {
	private int[] werte;
	
	// Konstruktor initialisiert das Array
	public Zahlen(int[] werte) {
		this.werte = werte;
	}
	
	// Gibt Element an bestimmten Index zurueck
	public int getIndex(int index) {
		// Ausnahme bei falscher Eingabe werfen
		if ((index < 0) || (index >= werte.length)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return werte[index];
	}
}
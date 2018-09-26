class Zahlen {
	private int[] werte;
	
	// Konstruktor initialisiert das Array
	public Zahlen(int[] werte) {
		this.werte = werte;
	}
	// Gibt Element an bestimmten Index zurueck
	public int getIndex(int index) throws ArrayIndexOutOfBoundsException {
		return werte[index];
	}
}
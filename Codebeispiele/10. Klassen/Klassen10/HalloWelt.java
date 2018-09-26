public class HalloWelt {
	public static int globaleVariable;
	
	public static void main(String args[]) {
		// Zugriff auf globale Variable moeglich
		globaleVariable = 10;
		
		// Zugriff auf die lokale Variable eines 
		// anderen Blocks dagegen nicht moeglich
		lokaleVariable = 10; // FEHLER
	}
	static void methode() {
		int lokaleVariable;
	}
}
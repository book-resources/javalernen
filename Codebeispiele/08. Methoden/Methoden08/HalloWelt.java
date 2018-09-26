public class HalloWelt {
	public static void main(String args[]) {
		HalloWelt o = new HalloWelt();
		System.out.println(o.berechneFak(5));  
	}
	// Berechnet die Fakultaet rekursiv
	public int berechneFak(int zahl) {
		// Dies ist die Abbruchbedingung
		if (zahl == 0) {
			return 1;
		}
		// Hier findet der rekursive Aufruf statt
		else {
			return zahl * berechneFak(zahl - 1);
		}
	}
}
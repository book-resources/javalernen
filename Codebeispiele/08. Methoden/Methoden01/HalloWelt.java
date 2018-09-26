public class HalloWelt {
	public static void main(String args[]) {
		// Erzeugen eines Klassenobjektes
		HalloWelt objekt = new HalloWelt();
		// Methodenaufruf
		System.out.println(objekt.istGerade(10));
	}
	public boolean istGerade(int zahl) {
		if (zahl % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
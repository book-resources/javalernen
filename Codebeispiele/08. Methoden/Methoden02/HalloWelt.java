public class HalloWelt {
	public static void main(String args[]) {
		HalloWelt o = new HalloWelt();
		boolean ergebnis = o.istKleinerZehn(10);
		System.out.println(ergebnis);
	}
	public boolean istKleinerZehn(int zahl) {
		if (zahl < 10) {
			return true;
		}
		else {
			return false;
		}
	}
}
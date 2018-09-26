public class HalloWelt {
	public static void main(String args[]) {
		boolean wahrheitswert;
		int zahl = 10;
		int nochEineZahl = 20;
		if (zahl > nochEineZahl) {
			wahrheitswert = true;
		}
		else {
			wahrheitswert = false;
		}
		int ausgabe = wahrheitswert ? 10 : 20;
		// Was kommt raus?
		System.out.println(ausgabe);
	}
}
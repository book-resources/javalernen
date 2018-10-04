public class Exercise {
	public static void main(String[] args) {
		Hund hund = new Hund();
		hund.bellen();

		Dackel dackel = new Dackel();
		dackel.bellen();
		
		Hund nochEinDackel = new Dackel();
		nochEinDackel.bellen();
	}
}
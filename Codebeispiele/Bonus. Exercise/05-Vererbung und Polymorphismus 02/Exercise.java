public class Exercise {
	public static void main(String[] args) {
		Rechteck r = new Rechteck(10, 5);

		System.out.println("A = " + r.berechneFlaecheninhalt());
		System.out.println("U = " + r.berechneUmfang());
	}
}
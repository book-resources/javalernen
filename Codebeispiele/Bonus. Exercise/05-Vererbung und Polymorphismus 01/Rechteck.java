public class Rechteck implements GeometrischesObjekt {
	private double laenge;
	private double breite;

	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double berechneFlaecheninhalt() {
		return laenge * breite;
	}
	public double berechneUmfang() {
		return 2 * (laenge + breite);
	}
}
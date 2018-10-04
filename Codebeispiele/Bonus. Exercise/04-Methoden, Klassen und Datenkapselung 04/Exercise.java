public class Exercise {
	public static void main(String args []) {
		System.out.println(Exercise.zinsenBerechnen(10000, 3, 5));
	}
	static double zinsenBerechnen(double betrag, double prozent, int jahre) {
		return betrag * (Math.pow((1 + (prozent / 100)), jahre));
	}
}
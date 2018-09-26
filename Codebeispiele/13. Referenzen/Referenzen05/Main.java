public class Main {
	public static void main(String args[]) {
		Apfel a = new Apfel();
		a.sorte = "Royal Gala";
		methode(a);
		System.out.println(a.sorte);
	}
	static void methode(Apfel apfel) {
		apfel = new Apfel();
		apfel.sorte = "Granatapfel";
	}
}
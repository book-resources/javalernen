public class Main {
	public static void main(String args[]) {
		Apfel a = new Apfel();
		a.sorte = "Royal Gala";
		Apfel b = a;
		b.sorte = "Granatapfel";
		
		System.out.println(a.sorte);
		System.out.println(b.sorte);
	}
}
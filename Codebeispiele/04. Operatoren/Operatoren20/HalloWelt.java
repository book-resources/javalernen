public class HalloWelt {
	public static void main(String args[]) {
		int a = 60; // Als Binaerzahl: 0011 1100
		int b = 10; // Als Binaerzahl: 0000 1010
		a |= b; // Aequivalent zu: a = a | b;
		System.out.println(a); 
	}
}
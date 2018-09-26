public class HalloWelt {
	public static void main(String args[]) {
		int a = 60; // Als Binaerzahl: 0011 1100
		int b = 13; // Als Binaerzahl: 0000 1101
		// Bitweises UND: 0011 1100 AND 0000 1101 
		// = 0000 1100
		System.out.println(a & b);
		// Bitweises ODER: 0011 1100 OR 0000 1101 
		// = 0011 1101
		System.out.println(a | b);
		// EXKLUSIV-ODER: 0011 1100 XOR 0000 1101 
		// = 0011 0001
		System.out.println(a ^ b);
		// Komplement von a: 1100 0011 = -61 
		// im 8-Bit Zweierkomplement
		System.out.println(~a);
		// Verschiebung nach links um 2 Stellen: 
		// Aus 0011 1100 wird 1111 0000
		System.out.println(a << 2);
		// Verschiebung nach rechts um 2 Stellen: 
		// Aus 0011 1100 wird 0000 1111
		System.out.println(a >> 2);
	}
}
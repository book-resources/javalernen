public class HalloWelt {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;

		System.out.println(a && b); // a UND b
		System.out.println(a && c); // a UND c
		System.out.println(a || b); // a ODER b
		System.out.println(b || d); // b ODER d
		System.out.println(a ^ b); // a XOR b
		System.out.println(a ^ c); // a XOR c
		System.out.println(b ^ d); // b XOR d
		System.out.println(!a); // NICHT a
		System.out.println(!b); // NICHT b  
		// a UND (c ODER d)          
		System.out.println(a && (c || d)); 
	}
}
public class HalloWelt {
	public static void main(String args[]) {
		int a = 10;
		int b = 10;
		boolean c = true;
		boolean d = false;
		// Identisch zu: if ((!d == true) && (a == b))        
		if (!d && (a == b)) {  
			// Identisch zu: if((d==true)||(!c==true))          
			if (d || !c) { 
				System.out.println("d || !c");
			}
			else if (a < b) {
				System.out.println("a < b");
				// Identisch zu: if (c == true)
				if (c) { 
					System.out.println("c");
				}
			}
		}
		else if (a == b) {
			System.out.println("a == b"); 
			// Identisch zu: if ((a == b) && (c == true))
			if ((a == b) && c) { 
				System.out.println("a == b) && c");
			}
		}
	}
}
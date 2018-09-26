public class HalloWelt {
	public static void main(String args[]) {
		HalloWelt o = new HalloWelt();
		
		System.out.println(o.istKleinerZehn(10));
		System.out.println(o.istKleinerZehn(42));
		System.out.println(o.istKleinerZehn(8));      
	}
	public boolean istKleinerZehn(int zahl) {
		if (zahl < 10) {
			return true;
		}
		else {
			return false;
		}
	}
}
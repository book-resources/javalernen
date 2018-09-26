public class HalloWelt {
	public static void main(String args[]) {
		HalloWelt obj = new HalloWelt();
		
		obj.istKleinerZehn(10);
		obj.istKleinerZehn(42);
		obj.istKleinerZehn(8);
	}
	public void istKleinerZehn(int zahl) {
		if (zahl < 10) {
			System.out.println(zahl + " < 10");
		}
		else {
			System.out.println(zahl + " >= 10");
		}
	}
}
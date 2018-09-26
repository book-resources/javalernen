public class HalloWelt {
	public static void main(String args[]) {
		NeueKlasse obj = new NeueKlasse();
		System.out.println(obj.getPrivateVar());
	}
}
class NeueKlasse {
	private int privateVar = 10;
	// Getter-Methode
	public int getPrivateVar() {
		return privateVar;
	}
}
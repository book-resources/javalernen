public class HalloWelt {
	public static void main(String args[]) {
		NeueKlasse obj = new NeueKlasse();
		// Ausgabe vor der Aenderung
		System.out.println(obj.getPrivateVar());
		// Aenderung des Wertes auf 50
		obj.setPrivateVar(50);
		// Ausgabe nach der Aenderung
		System.out.println(obj.getPrivateVar());
	}
}
class NeueKlasse {
	private int privateVar = 10;

	// Getter
	public int getPrivateVar() {
		return privateVar;
	}
	// Setter
	public void setPrivateVar(int neuerWert) {
		privateVar = neuerWert;
	}
}
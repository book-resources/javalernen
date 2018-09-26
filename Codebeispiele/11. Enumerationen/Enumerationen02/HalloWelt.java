public class HalloWelt {
	public enum Wochentag {
		MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
	}
	
	public static void main(String args[]) {
		Wochentag tag = Wochentag.MONTAG;
		if (tag == Wochentag.MONTAG) {
			System.out.println("Es ist Montag.");
		}
	}
}
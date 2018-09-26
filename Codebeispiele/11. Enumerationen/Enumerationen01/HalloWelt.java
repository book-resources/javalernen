public class HalloWelt {
	public enum Wochentag {
		MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
	}

	public static void main(String args[]) {
		Wochentag tag = Wochentag.MONTAG;
		System.out.println(tag);
	}
}
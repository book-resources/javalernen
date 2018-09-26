public class HalloWelt {
	public enum Wochentag {
		MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
	}
	
	public static void main(String args[]) {
		Wochentag tag = Wochentag.MONTAG;   
		switch (tag) {
		case MONTAG:
			System.out.println("Es ist Montag.");
			break;                
		default:
			System.out.println("Nicht Montag.");
		}
	}
}
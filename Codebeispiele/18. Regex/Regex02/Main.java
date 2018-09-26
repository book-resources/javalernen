import java.util.regex.*;
				
public class Main {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[^abc]*", "Welt"));
		System.out.println(Pattern.matches("[0-9]*", "55"));
		// Backslash als "\\" darstellen
		System.out.println(Pattern.matches("\\d*", "01010"));
		System.out.println(Pattern.matches("\\p{Blank}", " "));
	}
}
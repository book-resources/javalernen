import java.util.regex.*;
				
public class Main {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("0", "0"));
		System.out.println(Pattern.matches("0", "00"));
		System.out.println(Pattern.matches("0*", "00"));
		System.out.println(Pattern.matches("0*", "01"));
	}
}
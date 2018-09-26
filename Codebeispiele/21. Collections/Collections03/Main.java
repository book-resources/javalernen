import java.util.*;
					
public class Main {					
	public static void main(String args[]) {
		Set<Integer> s = new TreeSet<Integer>();

		int[] zahlen = { 99, 43, 3, 15, 65, 24, 77, 3};
		for (int i = 0; i < zahlen.length; i++) {
			s.add(zahlen[i]);
		}
		System.out.println(s);
	}
}
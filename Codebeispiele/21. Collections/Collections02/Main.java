import java.util.*;
					
public class Main {					
	public static void main(String args[]) {
		Set<Character> s = new HashSet<Character>();

		// fuegt ein Element hinzu
		s.add('a'); 
		s.add('b');
		s.add('a');
		System.out.println(s);
		// entfernt alle Elemente
		s.clear(); 
		// gibt Anzahl der Elemente der Menge an
		System.out.println(s.size()); 
		System.out.println(s);
		// gibt an, ob die Menge leer ist
		System.out.println(s.isEmpty()); 
		s.add('a');
		// entfernt ein Objekt aus der Menge
		s.remove('a'); 
		// gibt an, ob ein bestimmtes Element 
		// in der Menge enthalten ist
		System.out.println(s.contains('a')); 
	}
}
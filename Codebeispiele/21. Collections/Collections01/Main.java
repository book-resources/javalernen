import java.util.*;
					
public class Main {					
	public static void main(String args[]) {
		List<Integer> l = new ArrayList<Integer>();
		
		// fuegt Element ans Ende der Liste an
		l.add(5); 
		l.add(7);
		// fuegt Element (17) an einem 
		// angegebenen Index (0) hinzu 
		l.add(0, 17); 
		System.out.println(l);
		// liefert Objekt am angegebenen Index
		System.out.println(l.get(0)); 
		// liefert Index eines Objekts
		System.out.println(l.indexOf(17));
		// entfernt Objekt am angegebenen Index
		l.remove(1); 
		l.remove(1);
		System.out.println(l);
	}
}
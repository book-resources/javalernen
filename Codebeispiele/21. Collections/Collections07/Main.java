import java.util.*;
					
public class Main {					
	public static void main( String args[] ) {
		Queue<String> q = new PriorityQueue<String>();

		// fuegt ein neues Element am Ende 
		// der Warteschlange ein
		q.add("Eins");
		q.add("Zwei");
		q.add("Drei");
		// gibt an, ob ein bestimmtes Element 
		// enthalten ist
		System.out.println(q.contains("Vier")); 
		// entfernt ein angegebenes Element
		q.remove("Zwei"); 
		// gibt die Anzahl an Elementen an
		System.out.println(q.size()); 
		// gibt das erste Element zurueck, 
		// ohne es zu entfernen
		System.out.println(q.peek()); 
		// gibt das erste Element zurueck 
		// und entfernt es
		System.out.println(q.poll()); 
		// entfernt alle Elemente
		q.clear();
		System.out.println(q);
	}
}
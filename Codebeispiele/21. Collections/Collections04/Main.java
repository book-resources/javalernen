import java.util.*;
					
public class Main {					
	public static void main(String args[]) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		// fuegt ein Paar, bestehend aus Wert und 
		// Schluessel (Key), hinzu
		m.put("Auto", 5);
		m.put("Apfel", 9); 
		m.put("Banane", 3);
		// gibt an, ob ein bestimmter Key 
		// enthalten ist
		System.out.println(m.containsKey("Birne")); 
		// gibt an, ob ein bestimmter Wert 
		// enthalten ist
		System.out.println(m.containsValue(5)); 
		// gibt den Wert zu einem Key an
		System.out.println(m.get("Apfel"));
		// gibt an, ob die Map leer ist
		System.out.println(m.isEmpty()); 
		m.remove("Apfel");
		// gibt die Anzahl von Elementen an
		System.out.println(m.size()); 
		// entfernt alle Elemente
		m.clear(); 
	}
}
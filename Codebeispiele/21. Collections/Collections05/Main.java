import java.util.*;
					
public class Main {					
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		
		// legt ein Element oben auf den Stapel
		s.push(4); 
		s.push(5);
		s.push(6);

		// liest das oberste Element, 
		// entfernt es aber nicht
		System.out.println(s.peek()); 
		// liest oberstes Element und entfernt es
		System.out.println(s.pop()); 
		// gibt an, ob der Stapel leer ist
		System.out.println(s.empty()); 
	}
}
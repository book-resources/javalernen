import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<Integer>();

		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);

		int summe = 0;
		for (int i : liste) {
			summe += i;
		}
		System.out.println(summe);
	}
}
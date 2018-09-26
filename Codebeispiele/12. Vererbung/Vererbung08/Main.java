public class Main {
	public static void main(String args[]) {
		Apfel obj1 = new Apfel();
		// Apfel obj = new Obst(); NICHT MOEGLICH
		Obst obj2 = new Obst();
		// OK, da Apfel von Obst erbt
		Obst obj3 = new Apfel(); 
		Object obj4 = new Apfel();
		Object obj5 = new Obst();

		System.out.println(obj1 instanceof Apfel);
		System.out.println(obj1 instanceof Obst);
		System.out.println(obj1 instanceof Object);

		System.out.println(obj2 instanceof Apfel);
		System.out.println(obj2 instanceof Obst);
		System.out.println(obj2 instanceof Object);
		
		System.out.println(obj3 instanceof Apfel);
		System.out.println(obj3 instanceof Obst);
		System.out.println(obj3 instanceof Object);		

		System.out.println(obj4 instanceof Apfel);
		System.out.println(obj4 instanceof Obst);
		System.out.println(obj4 instanceof Object);

		System.out.println(obj5 instanceof Apfel);
		System.out.println(obj5 instanceof Obst);
		System.out.println(obj5 instanceof Object);
	}
}
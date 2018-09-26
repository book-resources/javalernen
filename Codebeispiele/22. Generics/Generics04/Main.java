public class Main {					
	public static void main(String args[]) {
		Box<Integer> b1 = new Box<Integer>();
		b1.add(123);
		
		System.out.println(b1.get());
		
		Box<String> b2 = new Box<String>();
		b2.add("Hallo Welt");
		
		System.out.println(b2.get());
	}
}
public class Main {					
	public static void main(String args[]) {
		Demo d1 = new Demo("Thread1");
		d1.start();
		
		Demo d2 = new Demo("Thread2");
		d2.start();
	}
}
import java.lang.Thread;

public class Demo extends Thread {
	private Thread thread;
	private String name;

	public Demo(String name) {
		this.name = name;
		thread = new Thread(this);
	}
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name);
				Thread.sleep(50);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void start() {
		thread.start();
	}
}
public class Exercise {
	public static void main(String args []) {
		Exercise obj = new Exercise();
		
		System.out.println(obj.ToSeconds(1));
		System.out.println(obj.ToSeconds(12));
		System.out.println(obj.ToSeconds(24));
	}
	int ToSeconds(int hours) {
		return hours * 3600;
	}
}
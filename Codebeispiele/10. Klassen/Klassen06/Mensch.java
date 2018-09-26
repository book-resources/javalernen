public class Mensch {
	// Membervariablen
	private int alter;
	private String name;
	
	// Konstruktor
	public Mensch(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}
	
	// Getter und Setter
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
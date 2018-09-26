public class Mensch {
	// Membervariablen
	private int alter;
	private String name;
	
	// Konstruktor
	public Mensch(int alter_, String name_) {
		alter = alter_;
		name = name_;
	}
	
	// Getter und Setter
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter_) {
		alter = alter_;
	}
	public String getName() {
		return name;
	}
	public void setName(String name_) {
		name = name_;
	}
}
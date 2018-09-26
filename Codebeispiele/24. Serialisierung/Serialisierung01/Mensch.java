public class Mensch implements java.io.Serializable {
	public String name;
	public String vorname;
	public transient int alter;
	public String geschlecht;

	public Mensch(String name, String vorname, int alter, String geschlecht) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}
}
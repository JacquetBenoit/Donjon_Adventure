package characters;

public class Weapons {
	
	// Attributs 
	private String name;
	private int attack;
	
	
	// Constructeurs
	public Weapons(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}
	
	
	// Getters et Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	// Methodes
	public String toString() {
		return "[nom = " + name + ", dégats = " + attack + "]";
	}
	
	
}

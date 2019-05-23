package characters;

public abstract class Weapons {
	
	// Attributs 
	protected String name;
	protected int attack;
	
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

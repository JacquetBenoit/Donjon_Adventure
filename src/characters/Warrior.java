package characters;

// Definition of the Warrior class
public class Warrior extends Character {
	
	// Attributs 
	protected String warriorShield;
	
	
	// Constructeurs
	public Warrior() {
		
		super();
		super.setLife(super.randomiser(5, 10));
		super.setAttack(super.randomiser(5, 10));
		warriorShield = "none";
	}
	
	public Warrior(String name) {
		
		super(name);
		life = super.randomiser(5, 10);
		attack = super.randomiser(5, 10);
		warriorShield = "none";
		
	}
	
	public Warrior(String name, String image, int life, int attack) {
		
		super(name, image);
		this.life = life;
		this.attack = attack;
		warriorShield = "none";
	}
	
	
	// Getters et Setters
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}

	

	
	// Methodes
	public String toString() {
		
		return super.toString() + "type = Guerrier" + "\n" 
								+ "points de vie = " + life + "\n" 
								+ "points d'attaque =  " + attack + "\n" 
								+ "arme = " + super.getWp() + "\n" 
								+ "bouclier = " + warriorShield + "\n" ;
	}
	
	
}
package characters;

// Definition of the Warrior class
public class Warrior extends Character {
	
	protected int life;
	protected int attack;
	protected String warriorWeapon;
	protected String warriorShield;
	
	// Constructor for the Warrior class without parameters
	public Warrior() {
		
		super();
		life = super.randomiser(5, 10);
		attack = super.randomiser(5, 10);
		warriorWeapon = "none";
		warriorShield = "none";
	}
	
	// Constructor for the Warrior class with parameters
	public Warrior(String name) {
		
		super(name);
		life = super.randomiser(5, 10);
		attack = super.randomiser(5, 10);
		warriorWeapon = "none";
		warriorShield = "none";
		
	}
	
	public Warrior(String name, String image, int life, int attack) {
		
		super(name, image);
		this.life = life;
		this.attack = attack;
		warriorWeapon = "none";
		warriorShield = "none";
	}
	
	public String toString() {
		
		return super.toString() + "type = Guerrier" + "\n" 
								+ "points de vie = " + life + "\n" 
								+ "points d'attaque =  " + attack + "\n" 
								+ "arme = " + warriorWeapon + "\n" 
								+ "bouclier = " + warriorShield + "\n" ;
	}
	
	
}
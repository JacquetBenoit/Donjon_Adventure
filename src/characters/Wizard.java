package characters;

public class Wizard extends Character {
	
	// Attributs 


	protected String wizardPhiltre;

	
	// Constructeurs
	public Wizard() {	
	
		super();
		super.setLife(super.randomiser(3, 6));
		super.setAttack(super.randomiser(8, 15));
		wizardPhiltre = "none";
	}
	
	public Wizard(String name) {
		
		super(name);
		life = super.randomiser(3, 6);;
		attack = super.randomiser(8, 15);
		wizardPhiltre = "none";
	}
	
	public Wizard(String name, String image, int life, int attack) {
		
		super(name, image);
		this.life = life;
		this.attack = attack;
		wizardPhiltre = "none";
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
		return super.toString() + "type = Magicien" + "\n" 
								+ "points de vie = " + life + "\n" 
								+ "points d'attaque =  " + attack + "\n" 
								+ "arme = " + super.getWp() + "\n" 
								+ "bouclier = " + wizardPhiltre + "\n";
	}

}
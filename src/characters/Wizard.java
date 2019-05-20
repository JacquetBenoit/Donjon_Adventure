package characters;

public class Wizard extends Character {
	
	protected int life;
	protected int attack;
	protected String wizardSpell;
	protected String wizardPhiltre;

	public Wizard() {	
	
		super();
		life = super.randomiser(3, 6);
		attack = super.randomiser(8, 15);
		wizardSpell = "none";
		wizardPhiltre = "none";
	}
	
	public Wizard(String name) {
		
		super(name);
		life = super.randomiser(3, 6);;
		attack = super.randomiser(8, 15);
		wizardSpell = "none";
		wizardPhiltre = "none";
	}
	
	public Wizard(String name, String image, int life, int attack) {
		
		super(name, image);
		this.life = life;
		this.attack = attack;
		wizardSpell = "none";
		wizardPhiltre = "none";
	}
	
	//public int getLife() {
		//return this.life;
	//}
	public String toString()
	{
		return super.toString() + "type = Magicien" + "\n" 
								+ "points de vie = " + life + "\n" 
								+ "points d'attaque =  " + attack + "\n" 
								+ "arme = " + wizardSpell + "\n" 
								+ "bouclier = " + wizardPhiltre + "\n";
	}

}
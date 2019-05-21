package characters;

public class Character {
	
	// Attributs 
	private String name;
	private String image;
	private Weapons wp;
	protected int attack;
	protected int life;


	// Constructeurs 
	public Character() {
		name = "Unknow";
		image = "none";
	}
	
	
	public Character(String name) {
		this.name = name;
		this.image = "None";
	}

	public Character (String name, String image) {
		this.name = name;
		this.image = image;
	}
	
	
	// Getters et Setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Weapons getWp() {
		return wp;
	}
	public void setWp(Weapons wp) {
		this.wp = wp;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}


	// Methodes 
	protected int randomiser(int min, int max) {
		int rnd = min + (int)(Math.random() * ((max - min) + 1));
		return rnd;
	}
	
	public String toString() {
		return "nom = " + name + "\n" + "image = " + image + "\n";
	}
}


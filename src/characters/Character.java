package characters;

abstract class Character {
	
/**
 	* Attributs de la classe Character	
 	*/
	private String name;
	private String image;
	private Weapons wp;
	protected int attack;
	protected int life;


/**
 	* Constructeur sans paramètres	
	*/
	public Character() {
		name = "Unknow";
		image = "none";
	}
	
/**
 * 
 * @param name
 * 			Nom du character
 */
	public Character(String name) {
		this.name = name;
		this.image = "None";
	}

/**
 * 
 * @param name
 * 			Nom du character
 * @param image
 * 			image du character
 */
	public Character (String name, String image) {
		this.name = name;
		this.image = image;
	}
	
	
/**
 * 
 * @return
 * 		Retourne le nom du character
 */
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
/**
 * 	
 * @return
 * 		Retourne l'image du character
 */
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
/**
 * 
 * @return
 * 		Retourne l'arme du character
 */
	public Weapons getWp() {
		return wp;
	}
	public void setWp(Weapons wp) {
		this.wp = wp;
	}
/**
 * 	
 * @return
 * 		Retourne les points d'attaque du character
 */
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

/**
 * 
 * @return 
 * 		Retourne les points de vie du character
 */
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}


	// Methodes 
/**
 *Methode de randomisation
 * 	
 * @param min
 * 		Valeur minimum
 * @param max
 * 		Valeur maximum
 * @return
 */
	protected int randomiser(int min, int max) {
		int rnd = min + (int)(Math.random() * ((max - min) + 1));
		return rnd;
	}
/**
 * Methode toString	
 */
	public String toString() {
		return "nom = " + name + "\n" + "image = " + image + "\n";
	}
}


package characters;

public class Weapon extends Weapons {
	
	// Constructeurs
	public Weapon(String weaponName, int weaponAttack) {
		this.name = weaponName;
		this.attack = weaponAttack;
	}

	// Methodes
	public String toString() {
		return "Arme : " + super.toString();
	}
	
}


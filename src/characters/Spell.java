package characters;

public class Spell extends Weapons {
	
	// Constructeurs
	public Spell(String spellName, int spellAttack) {
		this.name = spellName;
		this.attack = spellAttack;
	}
	
	// Methodes
	public String toString() {
		return "Sort : " + super.toString();
	}
	
}


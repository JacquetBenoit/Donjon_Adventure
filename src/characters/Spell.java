package characters;

public class Spell {
	
	private String spellName;
	private int spellAttack;
	
	public Spell(String spellName, int spellAttack) {
		super();
		this.spellName = spellName;
		this.spellAttack = spellAttack;
	}
	
	public String getSpellName() {
		return spellName;
	}

	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	public int getSpellAttack() {
		return spellAttack;
	}

	public void setSpellAttack(int spellAttack) {
		this.spellAttack = spellAttack;
	}

	public String toString() {
		return "Spell [spellName=" + spellName + ", spellAttack=" + spellAttack + "]";
	}
		
}


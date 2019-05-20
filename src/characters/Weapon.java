package characters;

public class Weapon {
	
	private String weaponName;
	private int weaponAttack;
	
	public Weapon(String weaponName, int weaponAttack) {
		super();
		this.weaponName = weaponName;
		this.weaponAttack = weaponAttack;
	}
	
	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getWeaponAttack() {
		return weaponAttack;
	}

	public void setWeaponAttack(int weaponAttack) {
		this.weaponAttack = weaponAttack;
	}

	public String toString() {
		return "Weapon [weaponName=" + weaponName + ", weaponAttack=" + weaponAttack + "]";
	}

	
}


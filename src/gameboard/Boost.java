package gameboard;


public class Boost extends Room {
	
	private int boostLife;
	private int boostAttack;
	
	
	public Boost() {
		super.setName("personnage mystérieux");
		super.setType("potion");
		boostLife = super.randomiser(0, 5);
		boostAttack = super.randomiser(0, 5);
	}


	public int getBoostLife() {
		return boostLife;
	}
	public void setBoostLife(int boostLife) {
		this.boostLife = boostLife;
	}

	public int getBoostAttack() {
		return boostAttack;
	}
	public void setBoostAttack(int boostAttack) {
		this.boostAttack = boostAttack;
	}


	@Override
	public String toString() {
		return super.toString() + " [boostLife=" + boostLife + ", boostAttack=" + boostAttack + "]";
	}
	
	
	

}

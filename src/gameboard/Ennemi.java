package gameboard;

public class Ennemi extends Room {
	
	private int attack;
	private int life;
	
	public Ennemi() {
		super.setName("Brigand");
		super.setType("Ennemi");
		attack = super.randomiser(3, 10);
		life = super.randomiser(6, 15);
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


	@Override
	public String toString() {
		return super.toString() + " [attack=" + attack + ", life=" + life + "]";
	}
	
	
	
	
}

package gameboard;

public class EmptyRoom extends Room {

	public EmptyRoom() {
		super.setType("vide");
		super.setName("Chemin");
	}

	@Override
	public String toString() {
		return super.toString() + " poursuivez votre aventure";
	}
	
	
}

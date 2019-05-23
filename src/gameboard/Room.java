package gameboard;

public class Room {
	
	protected String name;
	protected String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



	public static int randomiser(int min, int max) {
		int rnd = min + (int)(Math.random() * ((max - min) + 1));
		return rnd;
	}
	
	
	@Override
	public String toString() {
		return "Vous tombez sur un " + type + " de type " + name;
	}
	
	
}

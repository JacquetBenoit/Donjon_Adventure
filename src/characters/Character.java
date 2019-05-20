package characters;

public class Character {
	
	private String name;
	private String image;

	public Character() {
		name = "Unknow";
		image = "None";
	}
	
	
	public Character(String name) {
		this.name = name;
		this.image = "None";
	}

	public Character (String name, String image) {
		this.name = name;
		this.image = image;
	}
	

	public String getName() {
		return this.name;
	}
	

	
	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public void setName(String name) {
		this.name = name;
	}


	protected int randomiser(int min, int max) {
		int rnd = min + (int)(Math.random() * ((max - min) + 1));
		return rnd;
	}
	
	public String toString()
	{
		return "nom = " + name + "\n" + "image = " + image + "\n";
	}
}


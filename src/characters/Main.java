package characters;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Boolean trig = false;
		Character playerChar;	
		
		while(trig == false) {
			

		
			System.out.println("Entrez un nom pour votre personnage");
			String pName = input.nextLine();
			System.out.println("Bienvenu " + pName + " !");				
			
			System.out.println("Entrez 1: Guerrier // 2: Magicien");
			int characterChoice = input.nextInt();
			input.nextLine();
		
			if (characterChoice == 1) {
				playerChar = new Warrior(pName);
			} else /*if (characterChoice == "2")*/ {
				playerChar = new Wizard(pName);
			}

			System.out.println(playerChar);
			
			System.out.print("Voulez vous créer une arme ? 1: oui // 2: non");
			int createWeapon = input.nextInt();
			input.nextLine();
			
			if (createWeapon == 1) {
				
			} else {
				
			}
		}
		
	
	
	}
}

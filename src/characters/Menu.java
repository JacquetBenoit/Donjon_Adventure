package characters;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	public Menu() {
	
		// Variables
		Scanner sc = new Scanner(System.in);
		Boolean trig = false;
		Character player;
		int exit=0;
		
		// Tableau (collection)
		ArrayList<Character> players = new ArrayList<>();
		
		// Boucle principale
		while(exit != 2) {
			
			// Saisir nom du personnage
			System.out.println("Entrez un nom pour votre personnage");
			String pName = sc.nextLine();
			System.out.println("Bienvenu " + pName + " !");				
			
			// Choix du type de personnage
			System.out.println("Entrez [1]Guerrier // [2]Magicien");
			int characterChoice = sc.nextInt();
			sc.nextLine();
			
			// Test du choix de type et instanciation d'un personnage
			if (characterChoice == 1) {
				player = new Warrior(pName);
			} else /*if (characterChoice == "2")*/ {
				player = new Wizard(pName);
			}
			
			// Print des caractéristiques d'un personnage
			System.out.println(player);
			
			// Proposition de création d'une arme
			System.out.print("Voulez vous créer une arme ? [1]oui // [2]non");
			int createWeapon = sc.nextInt();
			sc.nextLine();
			
			// Test du type de personnage (Warrior ou Wizard) et instaciation d'une arme ou d'un sort en fonction
			if (createWeapon == 1) {
				Weapons arme;
				if (player instanceof Warrior){
					System.out.println("Entrez le nom de votre arme");
					String wName = sc.nextLine();
					arme = new Weapon(wName, 12);
				} else {
					System.out.println("Entrez le nom de votre sort");
					String sName = sc.nextLine();
					arme = new Spell(sName, 33);
				}
				
				// set l'arme au personnage
				player.setWp(arme);
			} 
			
			// Print des caractéristiques d'un personnage
			System.out.print(player);
			
			// Ajout du joueur au tableau
			players.add(player);
			
			// proposition de modification d'un personnage
			System.out.println("Voulez vous modifier votre personnage ? [1]oui // [2]non");
			int modify = sc.nextInt();
			sc.nextLine();
			
			// Test du choix et modification du nom
			if (modify == 1) {
				System.out.println("Voulez vous modifier le nom de votre personnage ? [1]oui // [2]non");
				int modName = sc.nextInt();
				sc.nextLine();
				
				if (modName == 1) {
					System.out.println("entrez le nouveau nom");
					String newName = sc.nextLine();
					player.setName(newName);
				} else {
					
				}
			}
			
			// affichage du ou des personnages
			System.out.println("Voulez vous afficher vos personnages ? [1]oui // [2]non");
			int show = sc.nextInt();
			sc.nextLine();
			
			if (show == 1) {		
				for(Character c : players)
				{
					System.out.println(c);
				}
			} else {
				
			}
			
			// créer un autre personnage ou quitter
			System.out.print("voulez vous créer un autre personnage ? [1]oui // [2]non");
			exit = sc.nextInt();
			sc.nextLine();
			
	}
	
	
	}
	
}


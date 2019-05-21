package characters;

import java.util.Scanner;
import java.util.HashMap;
//import java.util.ArrayList;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	//Tableau (collection)
	private HashMap<String, Character> players = new HashMap<String, Character>(); 
	
	private int playerNum = 1;
	private int exit = 0;
	private Character player;

	public Menu() {
	
		// Variables
		Boolean mainMenu = false;
		
		//Menu principal
		while(mainMenu == false) {
			System.out.println("  ___ MENU PRINCIPAL _________________________  \n"+
            "/                                              \\\n"+
            "|     [1]Créer un nouveau personnage           |\n"+
            "|     [2]Afficher et modifier les personnages  |\n"+
            "|     [3]Quitter                               |\n"+
            "\\______________________________________________/\n");
			
			int menuChoice = sc.nextInt();
			sc.nextLine();
			
			if (menuChoice == 1) {
				createPlayer();
			} else if (menuChoice == 2) {
				selectPlayer();
			} else if (menuChoice == 3) {
				mainMenu = true;
			}
		}
		
		
		// Boucle creation personnage

	}
	
	
	//--------------------------- Fonctions ---------------------------
	
	// Creation d'un personnage
	private void createPlayer() {
		while(exit != 2) {
			
			// Saisir nom du personnage
			System.out.println("Entrez un nom pour votre personnage");
			String pName = sc.nextLine();
			System.out.println("Bienvenu " + pName + " !");				
			
			// Choix du type de personnage
			System.out.println("Entrez [1]Guerrier | [2]Magicien");
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
			System.out.print("Voulez vous créer une arme ? [1]oui | [2]non");
			int createWeapon = sc.nextInt();
			sc.nextLine();
			
			// Test du type de personnage (Warrior ou Wizard) et instaciation d'une arme ou d'un sort en fonction
			if (createWeapon == 1) {
				Weapons arme;
				if (player instanceof Warrior) {
					System.out.println("Entrez le nom de votre arme");
					String wName = sc.nextLine();
					arme = new Weapon(wName, 12);
				} else {
					System.out.println("Entrez le nom de votre sort");
					String sName = sc.nextLine();
					arme = new Spell(sName, 33);
				}
				
				// Set l'arme au personnage
				player.setWp(arme);
			} 
			
			// Print des caractéristiques d'un personnage
			System.out.print(player.getWp() + "\n");
			
			// Ajout du joueur au tableau
			players.put("player" + playerNum ,player);
			playerNum++;
	

			// Creer un autre personnage ou quitter
			System.out.print("voulez vous créer un autre personnage ? [1]oui | [2]non");
			exit = sc.nextInt();
			sc.nextLine();
			
	}
	}
	
	
	// Afficher les personnages et en selectionner un
	private void selectPlayer() {
			
			for(String c : players.keySet())
			{
				System.out.println(c + "\n" + players.get(c)); }
				
				System.out.println("Pour selectionner un personnage entrez 'player[numero]' | [1]Quitter");
				String choice = sc.nextLine();
				
				if (!choice.equals("1")) {
					traiterPlayer(choice);
					
				}
	}
	
	
	// Traiter un personnage selectionne
	private void traiterPlayer(String  choice)
	{
		System.out.println(players.get(choice));
		
		System.out.println("Supprimer[1] | Modifier[2] | Sortir[3]");
		int choiceMod = sc.nextInt();
		sc.nextLine();
		
		if(choiceMod == 1) {
			players.remove(choice);
			
		} else if(choiceMod == 2) {
			modifPlayer(choice);
	
			
		} else {
			
		}
	}
	
	
	// Modifier un personnage selectionne
	private void modifPlayer(String choice)
	{
		int modify = 0;
		while (modify != 5) {
			System.out.println("Modifier : Nom[1] | Image[2] | Life[3] | Attack[4] | Sortir[5]");
			modify = sc.nextInt();
			sc.nextLine();
			
			if (modify == 1) {
				System.out.println("Entrez un nouveau nom");
				String newName = sc.nextLine();
				players.get(choice).setName(newName);
			} 
			
			if (modify == 2) {
				System.out.println("Entrez une nouvelle image");
				String newImage = sc.nextLine();
				players.get(choice).setImage(newImage);
			}
			
			if (modify == 3) {
				System.out.println("Modifier les points de vie");
				int newLife = sc.nextInt();
				sc.nextLine();
				if (players.get(choice) instanceof Warrior) {
					((Warrior) players.get(choice)).setLife(newLife);
				} else {
					((Wizard) players.get(choice)).setLife(newLife);
				}		
			}
			
			if (modify == 4) {
				System.out.println("Modifier les points d'attaque");
				int newAttack = sc.nextInt();
				sc.nextLine();
				if (players.get(choice) instanceof Warrior) {
					((Warrior) players.get(choice)).setAttack(newAttack);
				} else {
					((Wizard) players.get(choice)).setAttack(newAttack);
				}
			}
		}
	}
	
}


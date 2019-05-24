package characters;

import java.util.Scanner;

import gameboard.Boost;
import gameboard.EmptyRoom;
import gameboard.Ennemi;
import gameboard.Room;

import java.util.HashMap;
//import java.util.ArrayList;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	//Tableaux et collections
	private HashMap<String, Character> players = new HashMap<String, Character>(); 
	private Room[] board = new Room[15];
	
	private int playerNum = 1;
	private int exit = 0;
	private Character player;

	public Menu() {
	
		// Variables
		Boolean mainMenu = false;
		//Menu principal
		asciiBanner();
		while(mainMenu == false) {
			System.out.println("  ___ MENU PRINCIPAL _________________________  \n"+
            "/                                              \\\n"+
            "|     [1]Créer un nouveau personnage           |\n"+
            "|     [2]Afficher et modifier les personnages  |\n"+
            "|     [3]Jouer                                 |\n"+
            "|     [4]Quitter                               |\n"+
            "\\______________________________________________/\n");
			
			String menuChoice = sc.nextLine();
			exit = 0;
			
			if (menuChoice.equals("1")) {
				createPlayer();
			} else if (menuChoice.equals("2")) {
				selectPlayer();
			} else if (menuChoice.equals("3")) {
				selectToPlay();
			} else if (menuChoice.equals("4")) {
				mainMenu = true;
			} else {
				System.out.println("Veuillez entrer une valeur entre 1 et 4" + "\n");
			}
		}
	}
	
	
	//--------------------------- Fonctions ---------------------------
	
	// Creation d'un personnage
	private void createPlayer() {
		while(exit != 2) {
			
			asciiCharacter();
			// Saisir nom du personnage
			System.out.println("Entrez un nom pour votre personnage");
			String pName = sc.nextLine();
			System.out.println("Bienvenu " + pName + " !");				
			
			// Choix du type de personnage
			System.out.println("Entrez [1]Guerrier | [2]Magicien");
			String characterChoice = sc.nextLine();
			
			// Test du choix de type et instanciation d'un personnage
			if (characterChoice.equals("1")) {
				player = new Warrior(pName);
			} else if (characterChoice.equals("2")) {
				player = new Wizard(pName);
			} else {
				System.out.println("Veuillez entrer une valeur entre 1 et 2");
			}
			
			// Print des caractéristiques d'un personnage
			System.out.println(player);
			
			// Proposition de création d'une arme
			System.out.print("Voulez vous créer une arme ? [1]oui | [2]non");
			String createWeapon = sc.nextLine();
			
			// Test du type de personnage (Warrior ou Wizard) et instaciation d'une arme ou d'un sort en fonction
			if (createWeapon.equals("1")) {
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
	
	
	// Traiter un personnage selectionné
	private void traiterPlayer(String  choice) {
		
		System.out.println(players.get(choice));
		
		System.out.println("Supprimer[1] | Modifier[2] | Sortir[3]");
		String choiceMod = sc.nextLine();
		
		if(choiceMod.equals("1")) {
			players.remove(choice);
			
		} else if(choiceMod.equals("2")) {
			modifPlayer(choice);
			
		} else {
			
		}
	}
	
	
	// Modifier un personnage selectionne
	private void modifPlayer(String choice) {
		
		int modify = 0;
		while (modify != 5) {
			System.out.println("Modifier : Nom[1] | Image[2] | Sortir[5]");
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
			
//			if (modify == 3) {
//				System.out.println("Entrez les points de vie");
//				try {
//					int newLife = sc.nextInt();
//					sc.nextLine();
//					players.get(choice).setLife(newLife);
//				} catch(Exception e) {
//					System.out.println(e);
//					System.out.println("Entrez les points de vie VALEUR NUMERIQUE UNIQUEMENT");
//				}
//				finally {
//					System.out.println("Appuyez sur entrée");
//					sc.nextLine();
//				}	
//				
//			}
//			
//			if (modify == 4) {
//				try {
//					System.out.println("Entrez les points d'attaque");
//					int newAttack = sc.nextInt();
//					sc.nextLine();
//					players.get(choice).setAttack(newAttack);
//				} catch(Exception e) {
//					System.out.println(e);
//					System.out.println("Entrez les points d'attaque VALEUR NUMERIQUE UNIQUEMENT");
//				}
//				finally {
//					System.out.println("Appuyez sur entrée");
//					sc.nextLine();
//				}
//				
//				
//			}
		}
	}
	
	
	// initializer le plateau
	private void initGame() {
	 
		for (int i = 0; i<board.length; i++) {
			int rnd = rand(0, 100);
			
			if (rnd >= 0 && rnd < 50) {
				board[i] = new EmptyRoom();
			} else if (rnd >= 50 && rnd < 75) {
				board[i] = new Ennemi();
			} else if (rnd >= 75 && rnd <= 100) {
				board[i] = new Boost();
			}
		}
	
	}
	
	
	// selectionner un joueur pour commencer le jeu
	private void selectToPlay() {
		
		for(String c : players.keySet())
		{
			System.out.println(c + "\n" + players.get(c)); }
			
			System.out.println("Selectionnez un personnage pour jouer 'player[numero]' | [1]Quitter");
			String choice = sc.nextLine();
			
			if (!choice.equals("1")) {
				playGame(choice);
			}
		
	}
	
	
	// Jouer
	private void playGame(String player) {
		
		initGame();
		
		System.out.println("C'est le début de l'aventure ! ");
		int count = 0;
		
		// Boucle principale de jeu
		while (players.get(player).getLife() > 0 && count < 15) {
			
			System.out.println("Avancer[1]");
			String moove = sc.nextLine();
			
			if (moove.equals("1")) {
				System.out.println(board[count]);
				
			} else {
				System.out.println("Veuillez entrer [1] pour avancer !");
			}
			
			if (players.get(player).getLife() > 0 && count != 15 && moove.equals("1")) {
				
				if (board[count] instanceof Boost) {
					Boost boost = (Boost) board[count];
					System.out.println("Un personnage mysterieux vous propose une potion. " + "\n" + "Prendre la potion[1] | passer votre chemin[2]");
					String boostChoice = sc.nextLine();
					
					if (boostChoice.equals("1")) {
						players.get(player).setLife(players.get(player).getLife() + boost.getBoostLife());
						players.get(player).setAttack(players.get(player).getAttack() + boost.getBoostAttack());
						System.out.println("La potion vaut: points de vies = " + boost.getBoostLife() + " points d'attaque = " + boost.getBoostAttack());
						System.out.println("Stats de votre personnage = " + players.get(player));
					}
					
				} else if (board[count] instanceof Ennemi) {
					Ennemi ennemi = (Ennemi) board[count];
					System.out.println("Vous tombez dans un guet-apens ! " + "\n" + "Combattre le brigand[1] | s'enfuir[2]");
					String ennemiChoice = sc.nextLine();
					
					if (ennemiChoice.equals("1")) {
						while (ennemi.getLife() > 0) {
							ennemi.setLife(ennemi.getLife() - players.get(player).getAttack());
							if (ennemi.getLife() > 0) {
								players.get(player).setLife(players.get(player).getLife() - ennemi.getAttack());
							}
							System.out.println("Stats de votre personnage = " + players.get(player) + "\n" + " Stats de l'ennemi = " + ennemi.getLife());
						}
						
					} else if (ennemiChoice.equals("2")) {
						int random = rand(1, 3);
	
						if (random > 1 && random <= 3) {
							System.out.println("Fichtre ! Le brigand vous a ratrappé...");
							while (ennemi.getLife() > 0) {
								ennemi.setLife(ennemi.getLife() - players.get(player).getAttack());
								if (ennemi.getLife() > 0) {
									players.get(player).setLife(players.get(player).getLife() - (ennemi.getAttack() + 2));
								}
								System.out.println("Stats de votre personnage = " + players.get(player) + "\n" + " Stats de l'ennemi = " + ennemi.getLife());
							}
							
						} else if (random == 1) {
							System.out.println("Vous avez réussi a vous enfuir !");
							
						}
						
					}
					
				}
			}
			if (players.get(player).getLife() <= 0) {
				System.out.println("GAME OVER");
				break;
			}
			if (count == 14) {
				System.out.println("Bravo vous avez fini ! Quelle aventure !");
			}
			
			count++;
		}
		
	}
	
	
	
	
	private int rand(int min, int max) {
		int rnd = min + (int)(Math.random() * ((max - min) + 1));
		return rnd;
	}
	
	
	
	
	
	// ascii
	private static void asciiCharacter() {

        System.out.println(
            " __                                                \r\n" + 
            "/  |_  _  __ _  _ _|_ _  __    _  __ _  _ _|_ _  __\r\n" + 
            "\\__| |(_| | (_|(_  |_(/_ |    (_  | (/_(_| |_(_) | \n" +
            "\n\n"

        );
    }
	
	private static void asciiBanner() {
		System.out.println(
		" __                      _                        \r\n" +
		"/   _ __  _  _  |  _    |_| _|    _ __ _|_    __ _\r\n" +
		"\\__(_)| |_> (_) | (/_   | |(_|\\_/(/_| | |_|_| | (/_\n" +
		"\n\n"
				);
	}
}


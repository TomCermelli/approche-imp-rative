/**
 * 
 */
package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class Interactif21Batons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 3 2 1

		int batons = 21;
		int botNumber = 0; // la variable que va utilis� l'ordinateur
		boolean player = true;
		System.out.println("Vous pouvez retirer 1 , 2 ou 3 batons � la fois");
		
		
		
		//Tant qu'on a 1 baton le jeu continue
		while (batons > 1) {
			// JOUEUR 1
			while (player) {
				//On demande � l'utilisateur un nombre
				int playerNb = scanner.nextInt();
				
				//On indique que l'utilisateur doit saisir un nombre entre 1 et 3
				if (playerNb < 4 && playerNb > 0) {
					// Le cas ou on retire trop de baton � la fin , on oblige le joueur � ne pas aller en dessous de 1 baton
					while((batons - playerNb)<= 0) {
						System.out.println("Vous retirez trop de batons, recommenc�");
						System.out.print("Il reste " + batons + " batons");
						playerNb = scanner.nextInt();
					}
					batons = batons - playerNb;
					System.out.print("Vous avez enlev� " + playerNb + " batons");
					//On n'oublie pas de passer player � false afin de donn�e le tour � l'ordinateur
					player = false;
				}
				
				// Le cas ou on ne choisit pas un nombre valide
				else {
					System.out.println("Vous n'avez pas choisis un chiffre entre 1 et 3 inclut, veuillez recommencer");
				}
				System.out.println();
				System.out.print("Il reste " + batons + " batons");
				
				// Le cas ou on gagne, on affiche cette condition car on a nos valeurs finaux � ce moment la de la boucle
				if (batons == 1) {
					System.out.println("Vous avez gagnez, la partie est termin�e");
				}

			}
			
		

			// ORDINATEUR
			// player par d�fault et true, mais on le passe � false en fin de boucle plus haut
			if (!player && batons > 1) {
				//Tout les cas ou il reste 2-3-4 batons
				if (batons > 4) {
					botNumber = random.nextInt(3) + 1;
				} else if (batons == 3) {
					botNumber = random.nextInt(2) + 1;
				} else if (batons == 2) {
					botNumber = 1;
				}

				System.out.println();
				batons = batons - botNumber;
				System.out.println("L'ordinateur a enlev� " + botNumber + " batons");
				System.out.println("Il reste " + batons + " batons");
				
				
				//Condition de d�faite pour le joueur
				if (batons == 1) {
					System.out.println("GAME OVER");
				}
				// On n'oublie pas de redonner la main � l'autre joueur
				player = true;
			}

		}
	}

}

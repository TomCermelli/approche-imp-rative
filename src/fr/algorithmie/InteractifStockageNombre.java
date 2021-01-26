/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author tomce
 *
 */
public class InteractifStockageNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		System.out.println("Ecrivez 1 ou 2");

		int textNb = scanner.nextInt();
		int[] array = new int[3];
		int index = 0;

		while (true) {
			// Condition afin d'agrandir un tableau
			if (index == array.length - 1) {
				int[] temp = new int[array.length+1];
				for(int i = 0; i<array.length; i++) {
					temp[i] = array[i];
				}
				array = temp;
			}
			
			// Si on choisit l'option 1 , ajouter un nombre
			if (textNb == 1) {

				System.out.println("Renseignez un nombre, celui-ci s'ajoutera au tableau existant");
				int nb = scanner.nextInt();
				array[index] = nb;
				index++;
				
				// On dit à l'utilisateur qu'il faut qu'il renseigne un nombre
				System.out.println("Votre nombre " + nb + " a bien été ajouté");
				System.out.println("Ecrivez 1 ou 2");
				textNb = scanner.nextInt();
				
			// Si on choisit l'option 2, Afficher le tableau existant	
			} else if (textNb == 2) {
				System.out.println("Le tableaux comporte ces éléments : ");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}

				System.out.println();
				System.out.println("Ecrivez 1 ou 2");
				textNb = scanner.nextInt();
			// Si on n'entre ni dans l'option 1 ni l'option 2
			} else {
				System.out.println("Cette option n'existe pas, veuillez choisir entre l'option 1 ou 2");
				textNb = scanner.nextInt();
			}
		}

	}
}

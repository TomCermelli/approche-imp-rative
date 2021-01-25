/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somme = 0;
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();
		
		for(int i=nb; i>0; i--) {
			somme += i;
		}
		System.out.println("Voici la somme de tout les nombres entre 1 et " + nb  + " : " + somme);

	}

}

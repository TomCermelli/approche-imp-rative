/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int[] nb = new int[10];
		int maxNumber = 0;
		
		for(int i=0; i<5; i++) {
			nb[i] = scanner.nextInt();
			
			if(nb[i]>maxNumber) {
				maxNumber = nb[i];
			}
		}
		System.out.println("Le nombre le plus haut enregistrer est : " + maxNumber);
	}

}

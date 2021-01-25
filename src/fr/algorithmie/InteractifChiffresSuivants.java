/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();
		System.out.println("Voici les 10 nombres suivant " + nb);
		
		for(int i = 1; i<=10; i++) {
			System.out.print(nb+i + " ");
		}
	}

}

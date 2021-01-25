/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class InteractifTableMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();
		
		while(nb < 1 || nb > 10) {
			System.out.println("Veuillez saisir un nombre entre 1 et 10");
			nb = scanner.nextInt();
		}
		System.out.println("Vous avez choisis le chiffre : " + nb);
		for(int i = 1; i<=10; i++) {
			System.out.println(nb + "x" + i + "=" + (nb*i));
		}
	}

}

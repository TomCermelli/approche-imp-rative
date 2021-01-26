/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;


/**
 * @author tomce
 *
 */
public class InteractifPlusMoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber;
		int tentative = 0;
		
		randomNumber = random.nextInt(100) + 1;
		System.out.println("Le nombre à trouver est : " + randomNumber);
		
		System.out.println("Veuillez saisir un nombre entre 1 et 100");
		int nb = scanner.nextInt();
		while(nb != randomNumber) {
			if(nb > randomNumber) {
				tentative++;
				System.out.println("Vous avez saisis un nombre trop grand , veuillez rententez votre chance");
				nb = scanner.nextInt();
			}
			else if (nb < randomNumber) {
				tentative++;
				System.out.println("Vous avez saisis un nombre trop petit , veuillez rententez votre chance");
				nb = scanner.nextInt();
			}
		}
		System.out.println("Bravo, vous avez trouvé en " + tentative + " coups");
	}
}

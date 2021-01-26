/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author tomce
 *
 */
public class InteractifFinonnaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 1;
		int nb = number1 + number2;
		
		System.out.println("Entrer un nombre pour la suite de Fibonnaci");
		
		int rankN = scanner.nextInt();
		System.out.println("le rang utiliser ici était :" + rankN);
		for(int i=1; i<rankN; i++) {
			nb = number1 + number2;
			number1 = number2;
			number2 = nb;
			//System.out.print(nb + " ");
		}
		System.out.print(nb + " ");
	}

}

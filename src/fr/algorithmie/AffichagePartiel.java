/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class AffichagePartiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//On affiche les nombre entier supérieur à 3
		for(int i=0; i<array.length; i++) {
			if(array[i]>3) {
				System.out.print(array[i] + " est un entier supérieur à 3");
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		//On affiche les nombres entier pairs
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.print(array[i] + " est un entier pair");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------------");
		
		// On affiche les valeurs correspondant aux index pairs
		for(int i=0; i<array.length; i++) {
			if(i%2 == 0) {
				System.out.print(array[i] + " valeurs correspondant aux index pairs");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------------");
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i] + " est un entier impairs");
				System.out.println();
			}
		}
	}
}

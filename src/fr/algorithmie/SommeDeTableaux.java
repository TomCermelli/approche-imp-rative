/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class SommeDeTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int somme = 0;
		
		
		for(int i=0; i<array.length; i++) {
			somme += array[i] + array2[i];
		}
		System.out.println("La sommes des 2 tableaux est égal à " + somme);
	}
}

/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int addition = 0;
		
		//on Calcul la moyenne de notre tableau
		for(int i=0; i<array.length; i++) {
			addition += array[i];
		}
		int moyenne = addition / array.length;
		System.out.println("la moyenne de ce tableau est :" + moyenne);
	}
	
}

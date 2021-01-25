/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class RechercheMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4,};
		int max = 0;
		
		//Recherche le nombre le plus grand du tableau
		for(int i = 0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}	
		}
		System.out.println("Le plus grand nombre de ce tableau est : " + max);
	}
}

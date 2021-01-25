/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class ComparaisonTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int commun = 0;
		
		// Compte le nombre de nombre en commun entre les 2 tableaux, attention il peut y avoir des doublons il peut y avoir des doublons!
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array2[j] == array1[i]) {
					commun++;
				}
			}
		}
		System.out.println("il y a " + commun +" nombres en communs entre les 2 tableaux");
	}

}

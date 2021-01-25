/**
 * 
 */
package fr.algorithmie;

/**
 * Parcours de tableau, afficher un tableau par ordre croissant/d�croissant 
 * et ajout de donn�e dans un tableau vide
 * @author tomce
 *
 */
public class AffichageInverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		
		
		// Affiche les �l�ments d'un tableau sous forme croissante 
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		
		// Affiche les �lements d'un tableau sous forme d�croissante
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		
		// On initialise un tableau vide a 17 places vu qu'on peut pas agrandir un tableau
		int[] arrayCopy = new int[17];
		// On ajoute les �l�ments de array dans arrayCopy et on l'affiche
		for(int i=0; i<array.length; i++) {
			arrayCopy[i]=array[i];
			System.out.print(arrayCopy[i] + " ");
		}
		
	}
}

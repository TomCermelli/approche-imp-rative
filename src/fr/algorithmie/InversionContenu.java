/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class InversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int j = array.length-1; // On utilise la longueur du tableau pour ensuite décrémenté par la suite
		
		
		int[] arrayCopy = new int[17];
		// On ajoute les éléments de array dans arrayCopy mais dans l'odre inverse du tableau array
		for(int i=0; i<array.length; i++) {
			
			arrayCopy[i]=array[j];
			System.out.println("array est égale à : " + array[i]);
			System.out.println(" arrayCopy est égale à : " + arrayCopy[i]);
			System.out.println("----");
			j--;
			
		}
	}

}

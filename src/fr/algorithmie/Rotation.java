
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {0,1,2,3};
		int lastValue = array[array.length - 1];
		
		// on commence par la fin car c'est plus facil de partir de la fin d'un tableau sans le dépasser avec des i+1
		for(int i = array.length-1; i>-1; i--) {
			if(i>0) {
				array[i] = array[i-1]; // on prend la valeur de l'index en dessous celui ou on est actuellement
			}
			
			else if(i == 0) {
				array[i] = lastValue;
			}
			
		}
		
		// une 2eme boucle pour le lire avec tout les changements finaux
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	
	}

}

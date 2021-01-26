/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class FirstLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {6, 7};
		boolean verif = true;
		
		if(array.length>=1 && array[0] == array[array.length-1]) {
			verif = true;
		}
		else {
			verif = false;
		}
		System.out.println(verif);

	}

}

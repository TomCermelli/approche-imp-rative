/**
 * 
 */
package fr.algorithmie;

/**
 * @author tomce
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6};
		boolean verif = true;
		
		if(array[0] == 6 || array[array.length-1] == 6) {
			verif = true;
		}
		else {
			verif = false;
		}
		System.out.println(verif);
	}

}

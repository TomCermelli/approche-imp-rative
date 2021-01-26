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
		int[] array = {};
		boolean verif = true;
		
		if(array.length>0 && (array[0] == 6 && array[array.length-1] == 6)) {
			verif = true;
		}
		else {
			verif = false;
		}
		System.out.println(verif);
	}
}

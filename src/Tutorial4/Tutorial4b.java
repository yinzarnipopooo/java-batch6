package Tutorial4;

import java.util.Arrays;

/**
 * <h2> Tutorial4b Class</h2>
 * <p>
 * Process for Displaying Tutorial4b
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial4b {

	public static void main(String[] args) {

		String[] arr = { "Black", "White", "Yellow", "Blue", "Green" };

		System.out.println("\nArray before swaping : " + Arrays.toString(arr));

		String temp;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println("\nArray after swaping : " + Arrays.toString(arr));

	}

}

package Tutorial4;

import java.util.Arrays;

public class Tutorial4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "Black", "White", "Yellow", "Blue", "Green" };

		System.out.println("\nArray before swaping : " + Arrays.toString(arr));

		String temp;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println("\nArray after swaping : " + Arrays.toString(arr));

	}

}

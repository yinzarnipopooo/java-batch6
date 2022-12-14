package Tutorial3;

import java.util.Arrays;

public class Tutorial3b {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] arr_new = new int[arr.length - 1];
		int j = 4;
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i != j) {
				arr_new[k] = arr[i];
				k++;
			}
		}
		System.out.println("Before deletion :" + Arrays.toString(arr));
		System.out.println("After deletion :" + Arrays.toString(arr_new));

	}
}

package Tutorial2;

import java.util.Scanner;

public class Tutorial2b {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		// reading value from user
		int num1 = scan.nextInt();

		System.out.print("Enter the 2nd number: ");
		// reading value from user
		int num2 = scan.nextInt();

		System.out.print("Enter the 3rd number: ");
		// reading value from user
		int num3 = scan.nextInt();

		int largest = 0;

		for (int i = 1; i <= 3; i++) {

			if (num1 > num2) {

				largest = num1;

			} else if (num2 > largest) {
				largest = num2;
			} else if (num3 > largest) {

				largest = num3;

			} else {
				largest = largest;
			}

		}

		System.out.println("The largest number is : " + largest);

	}

}

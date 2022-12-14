package Tutorial3;

import java.util.ArrayList;
import java.util.Scanner;

import java.lang.reflect.Array;

/**
 * <h2> Tutorial3a Class</h2>
 * <p>
 * Process for Displaying Tutorial3a
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numArray = { 20, 22, 33, 45, 56, 67, 87, 34, 54, 56, 34, 56, 90, 68, 54, 23, 46 };
		double sum = 0;

		for (double num : numArray) {
			sum += num;
		}

		double average = sum / numArray.length;
		System.out.format("The average is : " + average);

	}

}

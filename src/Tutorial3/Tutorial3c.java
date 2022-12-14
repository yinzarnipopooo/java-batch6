package Tutorial3;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2> Tutorial3c Class</h2>
 * <p>
 * Process for Displaying Tutorial3c
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial3c {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");
	}

}

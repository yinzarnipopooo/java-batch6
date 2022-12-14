package Tutorial5;

import java.util.HashMap;

/**
 * <h2> Tutorial5c Class</h2>
 * <p>
 * Process for Displaying Tutorial5c
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial5c {

	public static void main(String[] args) {

		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		hash_map.put("Red", 1);
		hash_map.put("Green", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);
		// print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Is key 'Green' exists?");
		if (hash_map.containsKey("Green")) {
			// key exists
			System.out.println("yes! - " + hash_map.get("Green"));
		} else {
			// key does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is key 'orange' exists?");
		if (hash_map.containsKey("orange")) {
			System.out.println("yes! - " + hash_map.get("orange"));
		} else {
			System.out.println("no!");
		}

	}

}

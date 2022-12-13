package Tutorial5;

import java.util.HashMap;

public class Tutorial5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("Po Po", 10);
		map.put("Mo Mo", 30);
		map.put("No No", 20);

		// Print size and content of the Map
		System.out.println("Size of map is: " + map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("Po Po")) {

			// Mapping
			Integer a = map.get("Po Po");

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"Po Po\" is: " + a);
		}

	}

}

package Tutorial5;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2> Tutorial5b Class</h2>
 * <p>
 * Process for Displaying Tutorial5b
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial5b {

	public static <K, V> Map<K, V> copyMap(Map<K, V> original) {

		Map<K, V> second_Map = new HashMap<>();

		// Start the iteration and copy the Key and Value
		// for each Map to the other Map.
		for (Map.Entry<K, V> entry : original.entrySet()) {

			// using put method to copy one Map to Other
			second_Map.put(entry.getKey(), entry.getValue());
		}

		return second_Map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);

		// copyMap method would copy the original
		// hashMap to second_Map
		Map<String, Integer> second_Map = copyMap(hashMap);

		System.out.println(second_Map);

	}

}

package Tutorial7;

/**
 * <h2> Tutorial7b Class</h2>
 * <p>
 * Process for Displaying Tutorial7b
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial7b {

	public static boolean isPalindrome(String str) {
		// Initializing an empty string to store the reverse
		// of the original str
		String rev = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input string
		String str = "aba";

		// Convert the string to lowercase
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);

	}
}

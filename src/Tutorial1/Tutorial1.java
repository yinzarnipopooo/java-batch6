package Tutorial1;

/**
 * <h2> Tutorial1 Class</h2>
 * <p>
 * Process for Displaying Tutorial1
 * </p>
 * 
 * @author Yin Zarni Po Po Oo
 *
 */
public class Tutorial1 {

	public static void main(String[] args) {

		int rows = 7;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

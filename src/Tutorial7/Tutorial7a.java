package Tutorial7;

/**
 * <h2> Tutorial7a Class</h2>
 * <p>
 * Process for Displaying Tutorial7a
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial7a {

	public static void main(String[] args) {

		int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		while (i <= n) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

			i++;
		}

	}

}

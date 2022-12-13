package Tutorial3;

import java.util.ArrayList;
import java.util.List;

public class Tutorial3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

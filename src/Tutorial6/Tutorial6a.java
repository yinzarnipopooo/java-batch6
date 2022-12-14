package Tutorial6;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Tutorial6a {

	public static void main(String[] args) {

		// Creating two instances of file class
		// file1.txt exists in the system
		File file1 = new File("D:\\BIB Training\\Forpj");

		// file2.txt does not exist in the system
		File file2 = new File("D:\\BIB Training\\Forpj");

		// last modified returns date in milliseconds
		long time1 = file1.lastModified();
		long time2 = file2.lastModified();

		// Convert milliseconds into readable date time
		// format any desirable format can be achieved using
		// SimpleDateFormat
		DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

		System.out.println("GFG.java modified date is : " + sdf.format(time1));

		System.out.println("file.txt modified date is : " + sdf.format(time2));

	}

}

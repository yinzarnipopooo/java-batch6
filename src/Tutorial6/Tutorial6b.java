package Tutorial6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * <h2> Tutorial6b Class</h2>
 * <p>
 * Process for Displaying Tutorial6b
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial6b {

	public static void main(String[] args) {

		try {
			String file = "D:\\BIB Training\\Forpj\\sample.txt";
			String lineToAppend = "\r\nJava is a beautiful thing and I really like it from my soul....";
			byte[] byteArr = lineToAppend.getBytes();
			Files.write(Paths.get(file), byteArr, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

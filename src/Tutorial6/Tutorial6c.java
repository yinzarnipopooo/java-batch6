package Tutorial6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/**
 * <h2> Tutorial6c Class</h2>
 * <p>
 * Process for Displaying Tutorial6c
 * </p>
 * 
 * @author ${Yin Zarni Po Po Oo}
 *
 */
public class Tutorial6c {

	public static void main(String[] args) {

		BufferedReader br = null;
		String strLine = "";
		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("D:\\BIB Training\\Forpj\\sample.txt"), "UTF-8"));
			while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(strLine);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}

}

package Tutorial8;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tutorial8b {

	// any exceptions need to be caught
	public static void main(String[] args) throws IOException {
		// workbook object
		XSSFWorkbook workbook = new XSSFWorkbook();

		// spreadsheet object
		XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");

		// creating a row object
		XSSFRow row;

		// This data needs to be written (Object[])
		Map<String, Object[]> studentData = new TreeMap<String, Object[]>();

		studentData.put("3", new Object[] { "Roll No", "NAME", "Year" ,"Gender" });

		studentData.put("4", new Object[] { "128", "Rose", "2nd year" ,"F"});

		studentData.put("5", new Object[] { "129", "Lily", "2nd year" ,"M" });

		studentData.put("6", new Object[] { "130", "RubyJane", "2nd year" ,"F"});

		studentData.put("7", new Object[] { "131", "Jichu", "2nd year" ,"M" });

		studentData.put("8", new Object[] { "132", "Manoban", "2nd year" ,"F"});

		Set<String> keyid = studentData.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) {

			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = studentData.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(new File("D:\\BIB Training\\Forpj\\write1.xlsx"));

		workbook.write(out);
		out.close();
	}
}

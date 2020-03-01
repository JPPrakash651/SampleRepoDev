package Activity1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Selenium Project\\SampleProject\\Test Data\\qwert.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("TestSheet");
		for (int i = 0; i < 10; i++) {
			Row r = s.createRow(i);
			for (int j = 0; j < 10; j++) {
				Cell c = r.createCell(j);
				c.setCellValue("sfd" + i + j);

			}
		}
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);

		System.out.println("completed");
	}

}

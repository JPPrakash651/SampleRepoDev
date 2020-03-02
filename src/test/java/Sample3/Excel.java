package Sample3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	public static void main(String[] args) throws IOException {
		String current = System.getProperty("user.dir");
		System.out.println(current);
		File te = new File(current+"\\\\Test Data\\\\TestExcel.xlsx");			

		FileInputStream ite = new FileInputStream(te);
		Workbook w = new XSSFWorkbook(ite);
		Sheet s = w.getSheet("sample");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String s1 = String.valueOf(l);
		System.out.println(s1);
	}

}



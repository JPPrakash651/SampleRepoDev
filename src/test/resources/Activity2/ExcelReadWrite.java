package Activity2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Selenium Project\\SampleProject\\Test Data\\ExcelTask.xlsx");
		FileInputStream isf = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(isf);
		Sheet s = w.getSheet("input");

		File fw = new File("D:\\Selenium Project\\SampleProject\\Test Data\\ExcelWrite.xlsx");

		Workbook ww = new XSSFWorkbook();
		Sheet sw = ww.createSheet("outputsheet");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);
				System.out.println(c);
				int t = c.getCellType();
				if (t == 0) {
					Row r1 = sw.createRow(i);
					Cell c1 = r1.createCell(j);
					double d = c.getNumericCellValue();
					long l = (long) d;
					c1.setCellValue(l);
//					FileOutputStream osfw = new FileOutputStream(fw);
//					ww.write(osfw);
				} else if (t == 1) {
					Row r1 = sw.createRow(i);
					Cell c1 = r1.createCell(j);
					String ca = c.getStringCellValue();
					c1.setCellValue(ca);
//					FileOutputStream osfw = new FileOutputStream(fw);
//					ww.write(osfw);

				}
			}

		}
		FileOutputStream osfw = new FileOutputStream(fw);
		ww.write(osfw);
		osfw.flush();
		osfw.close();
	}


}

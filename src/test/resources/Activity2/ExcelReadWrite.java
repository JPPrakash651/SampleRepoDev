package Activity2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	private static String[][] read = new String[100][100];
	private static String current = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		readOper();
		writeOper(read);
	}

	private static String[][] readOper() {
		try {
			File f = new File(current + "\\Test Data\\ExcelTask.xlsx");
			FileInputStream isf = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(isf);
			Sheet s = w.getSheet("input");
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					int t = c.getCellType();
					if (t == 0) {
						double d = c.getNumericCellValue();
						long l = (long) d;
						String s1 = String.valueOf(l);
						read[i][j] = s1;
						System.out.println(read[i][j]);
					} else if (t == 1) {
						String ca = c.getStringCellValue();
						read[i][j] = ca;
						System.out.println(read[i][j]);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return read;
	}

	private static void writeOper(String[][] read) throws IOException {
		File f = new File(current + "\\Test Data\\ExcelWrite.xlsx");
		Workbook w1 = new XSSFWorkbook();
		Sheet s1 = w1.createSheet("Output write");
		String[][] obj = read;
		int rno = 0;
		for (String[] object1 : obj) {
			Row r1 = s1.createRow(rno++);
			int cno = 0;
			for (String object : object1) {
				Cell c1 = r1.createCell(cno++);
				c1.setCellValue(object);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(f);
			w1.write(out);
			out.close();
			System.out.println("writesheet1.xlsx Successfully created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/*
 * String current = System.getProperty("user.dir");
 * 
 * File f = new File(current + "\\Test Data\\ExcelTask.xlsx"); FileInputStream
 * isf = new FileInputStream(f); Workbook w = new XSSFWorkbook(isf); Sheet s =
 * w.getSheet("input");
 * 
 * System.out.println(current); File te = new File(current +
 * "\\Test Data\\ExcelWrite.xlsx");
 * 
 * Workbook ww = new XSSFWorkbook(); Sheet sw = ww.createSheet("outputsheet");
 * 
 * String[][] a= new String[50][50]; for (int i = 0; i <
 * s.getPhysicalNumberOfRows(); i++) { Row r = s.getRow(i);
 * 
 * for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
 * 
 * 
 * Cell c = r.getCell(j); // System.out.println(c); if (c == null) {
 * 
 * System.out.println("null"); } else if (c != null) { int t = c.getCellType();
 * if (t == 0) { Row r1 = sw.createRow(i); Cell c1 = r1.createCell(j); double d
 * = c.getNumericCellValue(); long l = (long) d; String s1 = String.valueOf(l);
 * c1.setCellValue(s1); System.out.println(c1); a[i][j]=s1; // FileOutputStream
 * osfw = new FileOutputStream(te); // ww.write(osfw); // // osfw.flush(); // *
 * osfw.close();
 * 
 * } else if (t == 1) { Row r1 = sw.createRow(i); Cell c1 = r1.createCell(j);
 * String ca = c.getStringCellValue(); c1.setCellValue(ca);
 * System.out.println(c1); a[i][j]=ca;
 * 
 * // FileOutputStream osfw = new FileOutputStream(te); // ww.write(osfw); // //
 * osfw.flush(); // osfw.close(); } }
 * 
 * // FileOutputStream osfw = new FileOutputStream(te); // ww.write(osfw); // //
 * osfw.flush(); // osfw.close(); }
 * 
 * } FileOutputStream osfw = new FileOutputStream(te); ww.write(osfw);
 * osfw.flush(); osfw.close(); }
 */
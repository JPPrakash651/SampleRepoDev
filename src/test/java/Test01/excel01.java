package Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel01 {
	
	

	    public static String[][] a = new String[3][8];

	    public static void main(String[] args) {
	//define an object
	    	excel01 dobj = new excel01();
	        dobj.readdata();
	//System.out.println(Arrays.toString(a));
	        dobj.writedata(a);
	    }
	    //Read method
	    public String[][] readdata() {
	        try
	        {
	            FileInputStream file = new FileInputStream(new File("C:\\Users\\120190\\Documents\\Pro\\old.xlsx"));
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            //Iterate through each rows one by one
	            for (Row row : sheet) {
	                //Iterate and get the cells from the row
	                Iterator<Cell> cellIterator = row.cellIterator();
	                for(int j=0; j<8;j++) {
	                    while (cellIterator.hasNext()) {
	                        // 3 is the number of columns
	                        for(int i=0; i<3;i++) {
	                            Cell cell = cellIterator.next();
	                            switch (cell.getCellType()) {
	                                case Cell.CELL_TYPE_NUMERIC:
	                                    //System.out.print(cell.getNumericCellValue());
	                                    break;
	                                case Cell.CELL_TYPE_STRING:
	                                    //System.out.print(cell.getStringCellValue());*/
	                                    String temp = cell.getStringCellValue();
	                                    a[i][j]=temp;
	                                    break;
	                            }
	                        }


	                    }
	                    file.close();
	                }
	            }
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return a;
	    }

	    //Write method
	    public void writedata (String[][] a2) {
	//Create a new Workbook
	        XSSFWorkbook workbook = new XSSFWorkbook();
	//Create a blank sheet
	        XSSFSheet sheet = workbook.createSheet(" Data ");
	        System.out.println(Arrays.toString(a2));
	        Object[][] datatypes = a2;
	        int rowNum = 0;
	        Row row = sheet.createRow(rowNum++);
	        int colNum = 0;
	        for (Object field : datatypes) {
	            Cell cell = row.createCell(colNum++);
	            if (field instanceof String) {
	                cell.setCellValue((String) field);
	            } else if (field instanceof Integer) {
	                cell.setCellValue((Integer) field);
	            }
	        }


	        try{
	            FileOutputStream out = new FileOutputStream(new File ("C:\\Users\\120190\\Documents\\Pro\\new.xlsx"));
	            workbook.write(out);
	            out.close();
	            System.out.println("writesheet1.xlsx Successfully created");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



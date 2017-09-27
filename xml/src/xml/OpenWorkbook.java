package xml;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenWorkbook {

	
	
	public static void main(String[] args) throws Exception{
	
		
		//create();
		read();
		
		
	}
	
	
	
	public static void create() throws IOException {
		//Create Blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook(); 
	    //Create a blank spreadsheet
	      XSSFSheet spreadsheet = workbook.createSheet("Hello World");
	      XSSFRow row = spreadsheet.createRow((short)0);
	      Cell cell = row.createCell(0);
	      cell.setCellValue("Hell");
	      
	      
	      cell = row.createCell(1);
	      cell.setCellValue("abc");
	      
	      //Create file system using specific name
	      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));
	      //write operation workbook using file out object 
	      workbook.write(out);
	      out.close();
	      System.out.println("createworkbook.xlsx written successfully");
	}
	
	
	
	
	static XSSFRow row;
	public static void read() throws IOException {
		 FileInputStream fis = new FileInputStream(
			      new File("Employees.xlsx"));
			      XSSFWorkbook workbook = new XSSFWorkbook(fis);
			      XSSFSheet spreadsheet = workbook.getSheetAt(0);
			      Iterator < Row > rowIterator = spreadsheet.iterator();
			      
			      
			      
			      while (rowIterator.hasNext()) 
			      {
			         row = (XSSFRow) rowIterator.next();
			         Iterator < Cell > cellIterator = row.cellIterator();
			         while ( cellIterator.hasNext()) 
			         {
			            Cell cell = cellIterator.next();
			            switch (cell.getCellTypeEnum()) 
			            {
			               case NUMERIC:
			               System.out.print( 
			               cell.getNumericCellValue() + " \t\t " );
			               break;
			               case STRING:
			               System.out.print(
			               cell.getStringCellValue() + " \t\t " );
			               break;
			            }
			         }
			         System.out.println();
			      }
			      fis.close();
	}
	
}

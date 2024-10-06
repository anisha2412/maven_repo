package excelthrows;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;   	// interface from dependencies - Row, Cell
import org.apache.poi.ss.usermodel.Cell;

public class ExcelRead 
{
	static FileInputStream f;    // Globally declaring file class from apache.poi dependency, to read data from a file
	static XSSFWorkbook w;       // Java class in apache.poi library, used to work with excel files in java
	static XSSFSheet sh;   		 // Java class in the apache.poi library,representing a excel work sheet in java.
		
	public static String getStringData(int a, int b) throws IOException  // int a, int b - row & column
	{
		f = new FileInputStream("C:\\Users\\ANISHA\\Desktop\\Java\\ExcelRead.xlsx");     //object of FileInputStream class
		w = new XSSFWorkbook(f);    	// Open workbook with file path
		sh = w.getSheet("Sheet1");    	// Open sheet, default sheet name - sheet1
		Row r = sh.getRow(a);           // Getting row        
		Cell c = r.getCell(b);          // Getting cell value inside row
		return c.getStringCellValue();	// Returning value to main method	
	}
	
	public static String getIntegerData(int a, int b) throws IOException 
	{		
		f = new FileInputStream("C:\\Users\\ANISHA\\Desktop\\Java\\ExcelRead.xlsx");     //object of FileInputStream class
		w = new XSSFWorkbook(f);    				// Open workbook with file path
		sh = w.getSheet("Sheet1");    				// Open sheet, default sheet name - sheet1
		Row r = sh.getRow(a);           			// Getting row        
		Cell c = r.getCell(b);
		int x = (int)c.getNumericCellValue();     	// Read integer data's [type casting]
		return String.valueOf(x);                  	// Convert integer data to string 				
	}
}







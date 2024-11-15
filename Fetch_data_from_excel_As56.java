package excle_sheet_data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.checker.units.qual.s;


public class Fetch_data_from_excel_As56
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
		// step 1 excle location
		FileInputStream f1=new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Selenium\\TestDataEx\\MySheet.xlsx");
		// step 2 open the excle	
		Workbook w1=	WorkbookFactory.create(f1);
		// Go to right sheet
		 Sheet  s1 = w1.getSheet("test1");
		   // go to particular row
		Row r1= s1.getRow(1);
		// go to the particular coloum
		Cell c1 = r1.getCell(0);
		 String user =  c1.getStringCellValue();
		System.out.println(user);
		
		Row r2= s1.getRow(1);
		// go to the particular coloum
		Cell c2 = r2.getCell(1);
		 String pws =  c2.getStringCellValue();
		 System.out.println(pws);
		 
		 //ChromeDriver driver = new 
	}

}

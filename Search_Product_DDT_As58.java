package excle_sheet_data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_Product_DDT_As58
{
   @Test
   public void search() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   
	   FileInputStream f1=new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Selenium\\TestDataEx\\MySheet.xlsx");
		
		Workbook w1=	WorkbookFactory.create(f1);
		String Product = w1.getSheet("test1").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(Product);
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Product+Keys.ENTER);
		Thread.sleep(3000);
	    driver.close();
   }
}

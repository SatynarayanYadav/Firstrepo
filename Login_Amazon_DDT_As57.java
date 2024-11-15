package excle_sheet_data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Amazon_DDT_As57
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\satya\\eclipse-workspace\\Selenium\\TestDataEx\\MySheet.xlsx");
			
		Workbook w1=	WorkbookFactory.create(f1);
		String Username = w1.getSheet("test1").getRow(2).getCell(0).getStringCellValue();
		String Pws = w1.getSheet("test1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(Username);
		System.out.println(Pws);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("//span[@class ='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		driver.findElement(By.xpath("//a[@class='nav-action-signin-button']/span")).click();
		Thread.sleep(2000);
		//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=2687513850426401773&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146956&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		driver.findElement(By.id("ap_email")).sendKeys(Username+Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.id("ap_password"));
		e2.sendKeys(Pws+Keys.ENTER);
         
	}

}

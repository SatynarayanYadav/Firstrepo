package start;
//Assignment14 WAP in flipkart clickon fashion menu using Xpath using text messade
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// Assignment14 WAP in flipkart clickon fashion menu using Xpath using text message
import org.openqa.selenium.chrome.ChromeDriver;

public class Fashion_flip_Xpath_As14 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		e1.click();		

	}

}

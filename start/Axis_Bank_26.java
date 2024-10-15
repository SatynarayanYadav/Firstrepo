package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axis_Bank_26 
{

	public static void main(String[] args) 
	{
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.axisbank.com/");
	    
	    WebElement e1 = driver.findElement(By.xpath("//div[@class='loginClk jsloginClk']"));
	    e1.click();
	    
	    
	    

	}

}

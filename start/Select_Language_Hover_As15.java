package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_Language_Hover_As15 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		
		Actions a1 =new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@lang ='hi-IN']/span/span")).click();
		
	}

}

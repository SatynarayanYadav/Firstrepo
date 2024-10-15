package start;
//Assignment 5
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtub_search_GTM 
  {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@id='search']"));
		e1.click();
		e1.sendKeys("Grotechminds" + Keys.ENTER);
		
		 
	}
}


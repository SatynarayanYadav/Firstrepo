package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 39 Handle javascript popup in https://grotechminds.com/javascript-popup/ page.

public class JavaScript_pop_Han_As39 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
  	    driver.get("https://grotechminds.com/javascript-popup/");
  	    Thread.sleep(2000);
  	    WebElement e1 = driver.findElement(By.xpath("//button[.='Click ']"));
  	    e1.click();
  	   Thread.sleep(2000);
  	    driver.switchTo().alert().dismiss();
  	   driver.findElement(By.className("menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-615243")).click();
  	    
// org.openqa.selenium.NoAlertPresentException:
	}

}

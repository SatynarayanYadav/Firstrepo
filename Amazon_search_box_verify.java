package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_search_box_verify 
{
   @Test
   public void searchbox()
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   
	   WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	   Assert.assertEquals(searchbox.isDisplayed(), true , "Sorry your search box is wrong");
	   
   }
}

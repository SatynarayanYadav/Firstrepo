package assertion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Search_Shoes_Verify_AS64 
{   
	@Test
	   public void searchshoes()
	{

		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   
		   WebElement s1 = driver.findElement(By.id("twotabsearchtextbox"));
		   s1.sendKeys("Shoes"+Keys.ENTER);
		   List <WebElement> sh = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		   int a = sh.size();
		   System.out.println("Total number of shoes = > "+a);
		   /*if(a<20)
		   {
			   System.out.println("Pass");
		   }
		   else
		   {
			   Assert.assertTrue(false, "Sorry shoese count is greater than 20");
		   }
		   */
		   Assert.assertTrue(a>20 , "Sorry shoese count is greater than 20");
		   
	   }
}

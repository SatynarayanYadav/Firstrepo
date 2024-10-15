package start;

//Assignment 33 Launch Amazon.in , search "Shoe" click on 1st shoe and add to cart


import java.util.Iterator;
import java.util.Set;

/*Assignment 33
Launch Amazon.in , search "Shoe" click on 1st shoe and add to cart
import java.util.Iterator;
import java.util.Set;
*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocard_As33
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    Thread.sleep(3000);

		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes"+Keys.ENTER);
		
		WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	    e2.click();
	    Set<String> s1=	driver.getWindowHandles();
	    Iterator<String> i2=s1.iterator();
	    String parentid =	i2.next();
	    String childid  =	i2.next();
	    
	    driver.switchTo().window(childid);
	    		
	    Thread.sleep(6000);
	    WebElement e3=driver.findElement(By.id("add-to-cart-button"));
	    e3.click();
	    
}
}

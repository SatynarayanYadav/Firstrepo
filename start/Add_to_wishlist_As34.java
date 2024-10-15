package start;

//Assignment 34 Launch Amazon.in , search "Shoe" click on 1st shoe and add to wishList

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_wishlist_As34
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    Thread.sleep(3000);

	    WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("Shoes"+Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
	    e2.click();
	    Set <String> s1 =  driver.getWindowHandles();
	    System.out.println(s1);
	    Iterator <String> i1 =  s1.iterator();
	    String parentid  =        i1.next();
	    String childid  =        i1.next();
	    
	    driver.switchTo().window(childid);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='a-button a-button-groupfirst a-spacing-none a-button-base a-declarative']")).click();
	    
	}

}

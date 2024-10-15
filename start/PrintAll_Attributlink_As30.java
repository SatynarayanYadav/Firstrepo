package start;
// Assignment 30 Print attribute values for particular attribute name.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll_Attributlink_As30 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    List <WebElement> li=   driver.findElements(By.tagName("a"));
	    int count = li.size();
	    System.out.println(count);
	    
	    for(int i =0; i<count;i++) 
	    {
	       WebElement e1= li.get(i);
	       String s1=  e1.getAttribute("href");
	       System.out.println(s1);
	    }
        


	}

}

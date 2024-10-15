package start;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 32 Launch naukri.com and click on Google and Move control to child window

public class Nukri_Moveto_chiledW_As32 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	    Thread.sleep(3000);
	    WebElement e1 =driver.findElement(By.xpath("//span[.='Google']"));
	    e1.click();
	    Thread.sleep(2000);
	   Set<String> s1= driver.getWindowHandles();
	   Iterator <String> i1 =  s1.iterator();
	   String Parentid =   i1.next();
	   String Childid =   i1.next();
	   
	   driver.switchTo().window(Childid);
	      

	}

}

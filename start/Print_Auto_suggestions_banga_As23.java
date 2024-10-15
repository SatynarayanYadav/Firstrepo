package start;

//Assignment 23 Launch google, Type "Bangalore" and from auto-suggestions print all options

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Auto_suggestions_banga_As23 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List <WebElement> li =driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		int count = li.size();
		System.out.println("List of size= "+count);
		Thread.sleep(3000);
		
		for(int i =0; i<count;i++)
		{
		 WebElement e2 =     li.get(i);
		 String s1=  e2.getText();
		 System.out.println(s1);
		}
	}

}

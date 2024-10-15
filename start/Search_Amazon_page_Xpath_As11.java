package start;
//Assignment 11 WAP launch Amazon.in try to search something  using search field using relative Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Amazon_page_Xpath_As11 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		e1.sendKeys("shoes" +Keys.ENTER);

	}

}

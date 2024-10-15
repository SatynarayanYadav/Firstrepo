package start;
/*
Assignment 21
Launch Amazon.in , Type "Shoe" and from auto-suggestions select 2nd Auto-suggestion option
*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions_Amazon_As21 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(1000);
		List <WebElement> li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = li.size();
		System.out.println("List of size= "+count);
		Thread.sleep(5000);
		li.get(1).click();
	}

}

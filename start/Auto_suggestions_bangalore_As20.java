package start;

/*Assignment 20
Launch google, Type "Bangalore" and from auto-suggestions select 6th Auto-suggestion option
import java.util.List;
*/

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions_bangalore_As20 {

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
		li.get(5).click();
	}

}

package start;
// Assignment 28 Launch Google and Right click on 'Gmail'
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_gmail_28 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    WebElement e1 = driver.findElement(By.linkText("Gmail"));
	    Actions a1 = new Actions(driver);
	   a1.contextClick(e1).perform();
	    

	}

}

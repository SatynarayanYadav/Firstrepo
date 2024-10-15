package start;
//Assignment 16 WAP on Hoverover using "https://grotechminds.com/hoverover/" website
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_hoverover_16 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//div[@class = 'toolrip4'])[1]"));
		
		Actions a1 =new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class = 'toolrip4']/span/div)[3]")).click();	

	}

}

package start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// Launch google and type india
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_google
{
   public static void main(String[] args) 
   {
	        ChromeDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	        driver.findElement(By.id("APjFqb")).sendKeys("india");
	        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
   }
}

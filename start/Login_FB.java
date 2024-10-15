package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_FB 
{
   public static void main(String[] args)
   {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.name("email")).sendKeys("satya@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("Hellotest01");
	 driver.findElement(By.name("login")).click();
   }
}

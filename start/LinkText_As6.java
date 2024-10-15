package start;
// Assignment6 WAP launch Amazon.in try to click mobile with help of Linktest Locator 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_As6 
{
  public static void main(String[] args) 
  {
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://amazon.in/");
	     driver.manage().window().maximize();
	     WebElement e1 = driver.findElement(By.linkText("Mobiles"));
	     e1.click();
	     
  }
}

package start;
 // Assignment7 WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText_As7 
{
  public static void main(String[] args) 
  {
	ChromeDriver driver = new ChromeDriver();
	 driver.get("https://amazon.in/");
	 driver.manage().window().maximize();
	 WebElement e1 = driver.findElement(By.partialLinkText("Customer"));
	 e1.click();
  }
}

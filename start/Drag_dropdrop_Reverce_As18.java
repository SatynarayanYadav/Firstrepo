package start;
/* Assignment 18WAP on Drag and Drop using "https://grotechminds.com/drag-and-drop/" 
 website And Revert the dragged element at its original position
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_dropdrop_Reverce_As18 {

	public static void main(String[] args) throws InterruptedException
	{
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/drag-and-drop/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("container-10"));
			Thread.sleep(1000);
			WebElement e2 = driver.findElement(By.id("div2"));
			 Actions a1 =new Actions(driver);
			 a1.dragAndDrop(e1, e2).perform();
			 
			 WebElement e3 = driver.findElement(By.id("div2"));
			Thread.sleep(1000);
			WebElement e4 = driver.findElement(By.id("container-10"));
			Actions a2 =new Actions(driver);
			a2.dragAndDrop(e3, e4).perform();

		}
	

	}

}

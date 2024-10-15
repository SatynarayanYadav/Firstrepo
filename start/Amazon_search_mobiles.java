package start;
// assignment 4
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_mobiles {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIsfHSyJbeiAMVXqlmAh30ZTKbEAAYASAAEgLEZfD_BwE_k_");
		 WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		 e1.sendKeys("iphoe15 128gb");
		 e1.sendKeys(Keys.ENTER);

	}

}

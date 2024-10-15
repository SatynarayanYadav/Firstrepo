package start;
// Assignment 12 WAP for TagName locator using learning HTML file
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_HTML_Tagname_As12 {

	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("file:///D:/Golu/learningHTML1%20-%20Copy.html");
	  driver.manage().window().maximize();
	  WebElement e1 = driver.findElement(By.tagName("input"));
	  e1.sendKeys("Test User"); 

	}

}

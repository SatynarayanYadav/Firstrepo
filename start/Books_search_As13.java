package start;
// Assignment 13 Launch amazon,select a catagory as books,search a book called power of minds and press enter button
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Books_search_As13 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
	    WebElement e1 =	driver.findElement(By.xpath("//select [@id ='searchDropdownBox']"));
	   
	    Select s1 = new Select(e1);
	    Thread.sleep(1000);
	    s1.selectByIndex(10);
	    WebElement e2 = driver.findElement(By.xpath("// input [@id ='twotabsearchtextbox']"));
	    Thread.sleep(1000);
	    e2.sendKeys("Power of minds" +Keys.ENTER);
	    

	}

}

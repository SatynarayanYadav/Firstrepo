package start;
// Assignment 24 Launch Amazon.in , Type "Shoe" and from auto-suggestions print all the options
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_text_auto_As24
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(1000);
		List<WebElement> li= driver.findElements(By.xpath("//div[@class = 'left-pane-results-container']/div/div/div"));

		for(int i=0;i<li.size();i++)
		{
				WebElement auto1=			li.get(i);
					String s1=		auto1.getText();
					System.out.println(s1);
		}	

	}

}

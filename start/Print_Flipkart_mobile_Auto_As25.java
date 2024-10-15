package start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Flipkart_mobile_Auto_As25 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("mobile");
		Thread.sleep(1000);
		List<WebElement> li= driver.findElements(By.xpath("//form[@class = '_2rslOn header-form-search OpXDaO']/ul/li"));

		for(int i=0;i<li.size();i++)
		{
				WebElement auto1=	li.get(i);
					String s1=		auto1.getText();
					System.out.println(s1);
		}	

	}

}

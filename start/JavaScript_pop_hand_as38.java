package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_pop_hand_as38 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Golu/learningHTML1%20-%20Copy.html");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("page of the title = "+driver.getTitle());

	}

}

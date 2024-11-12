package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 10 login to Amazon.in with Xpath
public class Login_Amazon_Xpath_As10 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
		e1.sendKeys("satya@gmail.com");
		WebElement e2 = driver.findElement(By.xpath("//input[@id = 'continue']"));
		e2.click();
		WebElement e3 = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
		e3.sendKeys("test@123");
		WebElement e4 = driver.findElement(By.xpath("//input[@id = 'signInSubmit']"));
		e4.click();
	}

}
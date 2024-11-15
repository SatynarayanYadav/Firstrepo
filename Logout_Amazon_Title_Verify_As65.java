package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Logout_Amazon_Title_Verify_As65
{

	@Test
	public void login_Amazon() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("satya27890@gmail.com"+Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.id("ap_password"));
		e2.sendKeys("Shubhi@10"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("laptop"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e3).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign Out']")).click();
		
		String expectedTitile = "Amazon Sign In1";
		String ectualTitle =     driver.getTitle();
		
		Assert.assertEquals(expectedTitile, ectualTitle);
		
	}
	
}

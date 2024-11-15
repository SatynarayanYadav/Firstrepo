package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout_Amazon_Emailbox_Verify_As65
{
	@Test
	public void login_Amazon() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https://www.amazon.in/?&tag=googhydrabk1-21&ref=nav_custrec_signin&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=5639722848068391924&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146957&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1&openid.identity=http://specs.openid.net/auth/2.0/identifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http://specs.openid.net/auth/2.0/identifier_select&openid.ns=http://specs.openid.net/auth/2.0");
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
		
		
		WebElement Emailbox = driver.findElement(By.id("ap_email"));
		
		Assert.assertEquals(Emailbox.isDisplayed(), true , "EmailBox is not displayed");
}
}

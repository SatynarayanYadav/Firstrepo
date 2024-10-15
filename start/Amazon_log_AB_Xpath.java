package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_log_AB_Xpath 

{
    public static void main(String[] args) 
    {
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.manage().window().maximize();
	    
	    WebElement e1 = driver.findElement(By.xpath("//input[@id='ap_email']"));
	    e1.sendKeys("satya@gmail.com");
	    
	    
	}
}

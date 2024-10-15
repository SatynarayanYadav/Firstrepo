package start;
// Assignment 9 WAP on learning htmt file with help of absolute Xpath(here not to use components Your Last name,Relegion,submit ,submit,and sign up )
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automated_Hiring_process_Registration_As9
{
  
	public static void main(String[] args) throws InterruptedException 
	{
	     	ChromeDriver driver = new ChromeDriver();
	     	driver.manage().window().maximize();
	     	driver.get("file:///D:/Golu/learningHTML1%20-%20Copy.html");
	     	WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));        //username
	     	e1.sendKeys("Satya");
	     	Thread.sleep(2000);
	     	WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));        //Hint
	     	e2.sendKeys("Sa");
	     	Thread.sleep(2000);
	     	WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));        //Passowrd
	     	e3.sendKeys("Sa123");
	     	Thread.sleep(2000);
	     	WebElement e4 = driver.findElement(By.xpath("(/html/body/form/input)[1]"));   //Your first name
	     	e4.sendKeys("Satynarayan");
	     	Thread.sleep(2000);
	     	WebElement e5 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")); //I have a boy
	     	e5.click();
	     	Thread.sleep(2000);
	     	WebElement e6 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));   //I have a Girl
	     	e6.click();
	     	Thread.sleep(2000);
	     	WebElement e7 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));   //I have a baby
	     	e7.click();
	     	Thread.sleep(2000);
	     	WebElement e8 = driver.findElement(By.xpath("(/html/body/input)[4]"));   //Male
	     	e8.click();
	     	Thread.sleep(2000);
	     	WebElement e9 = driver.findElement(By.xpath("(/html/body/input)[5]"));   //FeMale
	     	e9.click();
	     	Thread.sleep(2000);
	     	WebElement e10 = driver.findElement(By.xpath("(/html/body/input)[6]"));   //FeMale
	     	e10.click();
	}
	
}

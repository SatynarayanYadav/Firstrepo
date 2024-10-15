package start;

//Assignment 31 How to handle fileupload popup

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class File_Upload_handle_As31 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@id = 'fname']"));
		Thread.sleep(1000);
		e1.sendKeys("Test");
		WebElement e2 = driver.findElement(By.xpath("//input[@id = 'lname']"));
		Thread.sleep(1000);
		e2.sendKeys("dav");
		WebElement e3 = driver.findElement(By.xpath("//input[@id = 'email']"));
		Thread.sleep(1000);
		e3.sendKeys("Dev@gmail.com");
		WebElement e4 = driver.findElement(By.xpath("//input[@id = 'password']"));
		Thread.sleep(1000);
		e4.sendKeys("Sa12344@");
	
		WebElement e5 = driver.findElement(By.xpath("//input[@id = 'male']"));
		Thread.sleep(1000);
		e5.click();
	
		WebElement e6 = driver.findElement(By.xpath("//select[@id = 'Skills']"));
		Thread.sleep(1000);
		Select s1 = new Select(e6);
		s1.selectByValue("select1");
		
		WebElement e7 = driver.findElement(By.xpath("//select[@id = 'technicalskills']"));
		Thread.sleep(1000);
		Select s2 = new Select(e7);
		s2.selectByIndex(0);
		
		WebElement e8 = driver.findElement(By.xpath("//select[@id = 'Country']"));
		Thread.sleep(1000);
		Select s3 = new Select(e8);
		s3.selectByVisibleText("India");
		driver.findElement(By.xpath("//textarea[@id = 'Present-Address']")).sendKeys("Hello Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id = 'Permanent-Address']")).sendKeys("C.G");
		Thread.sleep(1000);
		WebElement e9 = driver.findElement(By.xpath("//input[@id = 'Pincode']"));
		e9.click();
		e9.sendKeys("450021");
		
		WebElement e10 = driver.findElement(By.xpath("//select[@id = 'Relegion']"));
		Thread.sleep(1000);
		Select s4 = new Select(e10);
		s4.selectByVisibleText("Hindu");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'file']")).sendKeys("D:\\Golu\\Automation Assignments\\download.pdf");
		
		Thread.sleep(2000);
		driver.findElement(By.id("relocate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value= 'Submit']")).click();
		Thread.sleep(5000);
		driver.quit();		
		
		
	
	
	}

}

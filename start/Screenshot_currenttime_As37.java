package start;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Assignment 37 Take a screenshot wth current time/unique screenshot.

public class Screenshot_currenttime_As37
{

	public static void main(String[] args) throws IOException 
	{	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
  	    driver.get("https://www.flipkart.in");
		Date a1 = new Date();
		System.out.println("time = "+a1);
		Date no = new Date(a1.getTime());
		System.out.println(no);
		
		
		
		 TakesScreenshot s1 = driver;
		   File Sour =  s1.getScreenshotAs(OutputType.FILE);
		   File dis = new File("D:\\Golu\\Assignment\\ScreenS\\"+new Screenshot_currenttime_As37().getClass()+ no +".png");
		   FileHandler.copy(Sour, dis);
        
	}

}

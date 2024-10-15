package start;
//Assignment 35 Write a Script to take a screenshot
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS_Amazon_homepage_As35
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		TakesScreenshot s1 =   driver;  // Upcasting driver to TakesScreenshot
		 File f1=       s1.getScreenshotAs(OutputType.FILE);    //  call abstract method getScreenshotAs (OutputType.FILE)       
         File destination =  new File("D:\\Golu\\Assignment\\ScreenS\\"+new SS_Amazon_homepage_As35().getClass()+".png"); // Create a object of File class
         FileHandler.copy(f1, destination); // use filehandler class and copay the ss from source to destination
	}

}

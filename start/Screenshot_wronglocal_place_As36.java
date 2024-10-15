package start;

//Assignment 36 Try to take a screenshot in wrong location,and findout exception type.

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_wronglocal_place_As36 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		TakesScreenshot s1 =   driver;
		File f1 =  s1.getScreenshotAs(OutputType.FILE);
		File dis = new File("F:\\test\\hello"+ new Screenshot_wronglocal_place_As36().getClass()+".png");
		FileHandler.copy(f1, dis);
		
		// Exception in thread "main" java.io.FileNotFoundException:

	}

}

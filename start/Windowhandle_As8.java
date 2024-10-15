package start;

//Assignment8 WAP for getWindowhandle()
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_As8 
{
   public static void main(String[] args) 
   {
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://amazon.in/");
	     driver.manage().window().maximize();
	     String a = driver.getWindowHandle();
	     System.out.println(a);
   }
}

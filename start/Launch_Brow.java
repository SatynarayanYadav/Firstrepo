package start;
//Launch the facebook
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Brow 
{
   public static void main(String[] args)
   {
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    
	    
	    FirefoxDriver driver1 = new FirefoxDriver();
	    driver1.get("https://www.facebook.com/");
	    
   }
}

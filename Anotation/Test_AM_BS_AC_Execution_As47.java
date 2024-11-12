package anutation_9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_AM_BS_AC_Execution_As47 
{
	 
    @Test
    public void add()
    {
   	 System.out.println("@Test");
    }
    

    @AfterMethod
    public void sub()
    {
   	 System.out.println("@AfterMethod");
    }
    
    @BeforeSuite
    public void BS()
    {
   	 System.out.println("@BeforeSuite");
    }
    
    @AfterClass
    public void BC()
    {
   	 System.out.println("@AfterClass");
    }
    
    
}

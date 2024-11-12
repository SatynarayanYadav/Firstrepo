package anutation_9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_Test1_Test2_AM_Execution_As49 
{
	@BeforeMethod
    public void BM()
    {
   	 System.out.println("BeforeMethod");
    }
	
	@Test
    public void add()
    {
   	 System.out.println("@Test1");
    }
   
	@Test
    public void add2()
    {
   	 System.out.println("@Test2");
    }
   
	@AfterMethod
    public void AM()
    {
   	 System.out.println("@AfterMethod");
    }
}

package anutation_9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_Test_AM_Execution_As48 

{
	@BeforeMethod
    public void BM()
    {
   	 System.out.println("BeforeMethod");
    }
	
	@Test
    public void add()
    {
   	 System.out.println("@Test");
    }
   
	@AfterMethod
    public void AM()
    {
   	 System.out.println("@AfterMethod");
    }
}

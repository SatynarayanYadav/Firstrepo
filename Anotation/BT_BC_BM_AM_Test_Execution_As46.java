package anutation_9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BT_BC_BM_AM_Test_Execution_As46 

{
     @BeforeTest
     public void BT()
     {
    	 System.out.println("@BeforeTest");
     }
     
     @BeforeClass
     public void BC()
     {
    	 System.out.println("@BeforeClass");
     }
     @BeforeMethod
     public void BM()
     {
    	 System.out.println("@BeforeMethod");
     }
     
     @AfterMethod
     public void sub()
     {
    	 System.out.println("@AfterMethod");
     }
     @Test
     public void add()
     {
    	 System.out.println("@Test");
     }
}

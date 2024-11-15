package anutation_9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_AM_AC_Execution_As45 


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
     @AfterClass
     public void cla()
     {
    	 System.out.println(" @AfterClass");
     }
}

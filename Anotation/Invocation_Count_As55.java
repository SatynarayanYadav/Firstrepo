package anutation_9;

import org.testng.annotations.Test;

public class Invocation_Count_As55
{
    @Test(invocationCount=3)
    
    public void ino()
    {
    	System.out.println("Test");
    }


      @Test(priority = 2)
      public void add()
      {
    	  System.out.println("add");
      }
      
      @Test (priority =1)
      public void sub()
      {
    	  System.out.println("sub");
      }
}
package anutation_9;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_9_Annot_order_As44
{
    @Test
    
    public void maintest()
    {
    	System.out.println("1st Test");
    }
    
    
    
    @AfterSuite
    public void AS()
    {
    	System.out.println("Print @AfterSuite");
    }
    @BeforeTest
    public void BT()
    {
    	System.out.println("Print  @BeforeTest");
    }
    
    @AfterTest
    public void AT()
    {
    	System.out.println("Print  @AfterTest");
    }
    
    @BeforeClass
    public void BC()
    {
    	System.out.println("Print @BeforeClass");
    }
    
    @AfterClass
    public void AC()
    {
    	System.out.println("Print @AfterClass");
    }
    
    @BeforeMethod
    public void BM()
    {
    	System.out.println("Print @BeforeMethod");
    }
    
    @Test
    public void Second()
    {
    	System.out.println("2nd Test");
    }
    
    @AfterMethod
    public void AM()
    {
    	System.out.println("Print @AfterMethod");
    }
    
    @BeforeSuite
    public void BS()
    {
    	System.out.println("Print @BeforeSuite");
    }
    
    @Test
    public void Thard()
    {
    	System.out.println("3rd Test");
    }
}


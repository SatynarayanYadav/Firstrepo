package assignment_from_27;

public class Try_Catch_As41 {

	public static void main(String[] args) 
	{
		try 
		   {
			   int i = 1/0;
			   System.out.println("Print the value of i = "+i);
			  
		   }
		   catch (ArithmeticException a)
		   {
			   System.out.println("Handel the exception");
		   }
		   finally
		   {
			   System.out.println("welcome to the team");
		   }

	}

}

package assignment_from_27;


// Assignment 48 WAP of Method Overloading
public class Method_Overloading_As48 
{

	
		void login(String email , String pws)
		{
			System.out.println("Login success with email id");
		}
		
		void login(long mo , String pws)
		{
			System.out.println("Login success with mobile number");
		}
	    public static void main(String[] args) 
	    {
	    	Method_Overloading_As48 obj = new Method_Overloading_As48();
	    	obj.login("test@gmail.com", "123rty");
	    	obj.login(7686383838l, "7868yui");
		   	  
		

	}

}

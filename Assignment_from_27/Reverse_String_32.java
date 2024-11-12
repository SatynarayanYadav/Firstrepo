package assignment_from_27;

// Assignment 32 Write a program to reverse String ex-school
public class Reverse_String_32 {

	public static void main(String[] args)
	{
	    String input = "school";
	    String output = " ";
	    
	    System.out.println("Print string before the reverce = "+input);
	    for (int i = input.length()-1; i>=0 ; i--)
	    {
	    	
	    	   char ta =  input.charAt(i);
	    	   output  = output+ta;
	    }
	                   
               System.out.println("Print string after reverce =  "+output);  
	}

}

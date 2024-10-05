package assignment_from_27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// Assignment 47 Iterate Set Interface
public class Set_interface_itrator_As47 
{

	public static void main(String[] args) 
	{
	 	   Set se = new HashSet();
	 	   se.add(20);
	 	   se.add("test");
	 	   se.add(12);
	 	   se.add(null);
	 	   
	 	 Iterator s1 =   se.iterator();
	 	 while (s1.hasNext())
	 	 {
	 		 System.out.println(s1.next());
	 	 }

	}

}

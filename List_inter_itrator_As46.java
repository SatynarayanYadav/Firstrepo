package assignment_from_27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Assignment 46 Iterate List Interface 
public class List_inter_itrator_As46 
{

	public static void main(String[] args) 
	{
		List Po=  new ArrayList();
	       Po.add(80);
	       Po.add(90);
	       Po.add(100);
	       Po.add("Stirng");
	            
	     Iterator i1= Po.iterator();
	     while (i1.hasNext())
	     {
	    	 System.out.println(i1.next());
	     }
	      

	}

}

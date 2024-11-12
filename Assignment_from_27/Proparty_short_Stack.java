package assignment_from_27;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Proparty_short_Stack 
{
  public static void main(String[] args) 
  {
	    Stack St =  new Stack();	
	    St.add(12);
	    St.add(90);
	    St.add("String1");
	    St.add("test");
	    St.add("test");
	    St.add(null);
	    St.add(null);
	    St.add('H');
	    St.add(18.78);
	    St.add(35.67f);
	   
	   System.out.println(St);
	   
	   Stack St1 =  new Stack();
	   St1.add("String1");
	   St1.add("test");
	   St1.add("tdest1");
	   St1.add("Ato");
	   
	   System.out.println(St1);
	   Collections.sort(St1);
	   System.out.println("After sorting = "+St1);
  }
}

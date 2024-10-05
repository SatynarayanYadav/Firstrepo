package assignment_from_27;

import java.util.Collections;
import java.util.LinkedList;

public class Proparty_LinkedList 
{
     public static void main(String[] args)
     {
    	 LinkedList Ll= new LinkedList();	
    	   Ll.add(12);
    	   Ll.add(90);
    	   Ll.add("String1");
    	   Ll.add("test");
    	   Ll.add("test");
    	   Ll.add(null);
    	   Ll.add(null);
    	   Ll.add('H');
    	   Ll.add(18.78);
    	   Ll.add(35.67f);
    	   
    	   System.out.println(Ll);
    	   
    	   LinkedList L2= new LinkedList();
    	   L2.add("String1");
    	   L2.add("test");
    	   L2.add("tdest1");
    	   L2.add("Ato");
    	   
    	   System.out.println(L2);
    	   Collections.sort(L2);
    	   System.out.println("After sorting = "+L2);
    	   
	 }
}

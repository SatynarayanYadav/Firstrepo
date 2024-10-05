package assignment_from_27;

/*Assignmnet 36
In given String find
how many are alphabets,
how many are special character,
how many are numeric,
how many are Spaces*/
public class Alph_Nu_space_sechar_36 {

	public static void main(String[] args)
	{
	    int alpha = 0;
	    int numeric = 0;
	    int space = 0;
	    String St = "My Name @$# 778678768 *&";
	    char [] ch  =  St.toCharArray(); // convert from string to arrays
	  //System.out.println(ch);
	    for (int i=0 ; i< St.length(); i++) 
	    {
	    	boolean b1 = Character.isLetter(ch[i]);
	    //ystem.out.println(b1);
	    	if (b1==true)
	    	{
	    		alpha++;
	    	}
	    }
	     System.out.println("alpha count is = "+alpha);
	     
	     for (int i=0 ; i< St.length(); i++) 
		    {
		    	boolean b2 = Character.isDigit(ch[i]);
		    //ystem.out.println(b1);
		    	if (b2==true)
		    	{
		    		numeric++;
		    	}
		    }
		     System.out.println("numeric count is = "+numeric );
		     for (int i=0 ; i< St.length(); i++) 
			    {
			    	boolean b3 = Character.isSpaceChar(ch[i]);
			    //ystem.out.println(b1);
			    	if (b3==true)
			    	{
			    		space++;
			    	}
			    }
			  System.out.println("space count is = "+space );   
			     
	        int count  = St.length();
	        int Spacalchar = count-(alpha+numeric+space);
	        System.out.println("Spacal char count is = "+Spacalchar);
	   
	

	}

}

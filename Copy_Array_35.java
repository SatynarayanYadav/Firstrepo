package assignment_from_27;

import java.util.Arrays;

public class Copy_Array_35 {

	public static void main(String[] args) 
	{
	      int [] cp = new int [3];
	      cp[0]= 12;
	      cp[1]= 34;
	      cp[2]= 56;
	      int [] cp1 = new int [3];
	      
	      for (int i = 0; i<3 ; i++)
	      {
	    	       cp1[i] = cp[i];
	      }
           System.out.println(Arrays.toString(cp));
           System.out.println(Arrays.toString(cp1));
	}

}

package assignment_from_27;

import java.util.Arrays;

//Assignment 34 Find out if given two string are anagram of each other
public class Anagram_Array_34 {

	public static void main(String[] args)
	{
		 String word1 = "ARM";
		 String word2 = "MRA";
		 
		      char [] ch1 = word1.toCharArray();
		      char [] ch2 = word2.toCharArray();
		      
		      Arrays.sort(ch1);
		      Arrays.sort(ch2);
		      System.out.println(ch1);
		      System.out.println(ch2);
		      
		      boolean bo = Arrays.equals(ch1, ch2);
		      System.out.println(bo);
		      if (bo==true)
		      {
		    	  System.out.println("it is a Anagram");
		      }
		      else
		      {
		    	  System.out.println("It is not a Anagram");
		      }

	}

}

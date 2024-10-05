package assignment_from_27;

import java.util.Arrays;

//Assignment 45 hoe to sort the value of your array
public class Array_Sort_As45 {

	public static void main(String[] args)
	{
		String st = "satya";
		char [] ch = st.toCharArray();
		System.out.println("Before shorting the value = "+Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println("After shorting the value = "+Arrays.toString(ch));

	}

}

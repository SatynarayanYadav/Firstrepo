package assignment_from_27;

import java.util.Arrays;
import java.util.Scanner;

// Assignment 43 Write program Accept the value of yout array at the runtime ,if it is of int datatype size os 4
public class Scanner_Array_Runtime_As43 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
        int roll[] = new int [4];
        System.out.println("enter the roll no");
        
        for (int i =0; i<4; i++)
        {
        roll[i] = s1.nextInt();
        }
    System.out.println(Arrays.toString(roll));
    s1.close();

	}

}

package assignment_from_27;

import test.Con_overload;

// Assignment 49 WAP of Coustructor Overloading
public class Constru_Overloading_As49 {

	Constru_Overloading_As49(int a, int b)
	{
		 int sum = a+b;
		System.out.println("Addition of two numbers => "+sum);
	}
	
	Constru_Overloading_As49()
	{
		System.out.println("without para constructor");
	}
	
	public static void main(String[] args) 
	{
		new Constru_Overloading_As49 (10,5);
		new Constru_Overloading_As49();
	}

}

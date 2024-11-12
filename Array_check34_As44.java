package assignment_from_27;

public class Array_check34_As44 {
//Assignmnet 44 Create a array of size of 5 and just check 34 is present in array or not
	public static void main(String[] args) 
	{
		int to[] = new int [5];
		to[0] = 23;
		to[1] = 12;
		to[2] = 24;
		to[3] = 14;
		to[4] = 34;
		int check = 34;
		for (int i=0;i<5;i++)
		{
			if(check == to[i])
			{
				System.out.println("34 number is a present in the arrya ");
			}
			
		}
			
	}

}

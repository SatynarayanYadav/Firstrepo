package assignment_from_27;

//Assignment 33 Check if given string is palindrome or not Ex:-Malayalam
public class Palindrome_33 {

	public static void main(String[] args) 
	{
		String name = "malayalam";
		String pal = " ";
		      
		   for (int i = name.length()-1; i>=0 ; i--)
		   {
			        char ch =  name.charAt(i);
			             pal = pal+ch;
		   }
                System.out.println(pal);
                 if ( name.equals(pal) == true)
                 {
                	 System.out.println("it is Palindrom");
                 }
                 else
                 {
                	 System.out.println("It is not a Palindrom");
                 }
	}

}

package assignment_from_27;

import java.util.Date;
// Assignment 39 Past Time
public class Past_time_As39
{
	public static void main(String[] args) 
	{
		Date a1 = new Date();
		Date obj =  new Date(a1.getTime()-(1*24*60*60*1000));
		System.out.println("Past date time => "+obj);           //day hr  min   60dec  1sec
		// contvert the data to string
		String St1 = obj.toString();
		
		String Year = St1.substring(St1.length()-4);
		System.out. println(Year);
		
		String Month = St1.substring(4, 7);
		System.out.println(Month);
		
		String date = St1.substring (8, 10);
		
		String J1 = date.concat ("/"). concat (Month).concat ("/"). concat (Year) ;
		System.out.println(J1);
	

	}
}

/** Program: Days of a Month
* File: Exercise4_17.java
* Summary: Displays the number of days in a month.
* Author: Charles Maple III
* Date: June 26, 2016 
**/

import java.util.Scanner;

public class Exercise4_17 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		
		int year = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter a Month: ");
		String month = input.nextLine();
		
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		
		switch (month)
		{
		
		case "Feb":
			if(isLeapYear)
			{
				System.out.println(month + " " + year + " has 29 days"); break;
			}
			else
			{
				System.out.println(month + " " + year + " has 28 days"); break;
			}
			
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(month + " " + year + " has 31 days"); break;
			
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(month + " " + year + " has 30 days"); break;
		}
	}
}

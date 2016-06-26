/** Program: Check substring
* File: Exercise4_22.java
* Summary: prompts user to enter 2 strings and reports whether the second is a substring of the first.
* Author: Charles Maple III
* Date: June 26, 2016 
**/

import java.util.Scanner;

public class Exercise4_22 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();
		
		if (s1.contains(s2))
		{
			System.out.println(s2 + " is a substring of " + s1);
		}
		else
		{
			System.out.println(s2 + " is not a substring of " + s1);
		}
		
	}
}

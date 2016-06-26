/** Program: Cost of Trip
* File: Exercise_2_23.java
* Summary: Displays the cost of the trip based off of fuel MPG, price of gas, and distance driven.
* Author: Charles Maple III
* Date: June 26, 2016 
**/

import java.util.Scanner;

public class Exercise_2_23 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter MPG: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		double cost = distance / 25.5 * pricePerGallon;
		
		System.out.print("The cost of driving is $" + cost);
		
	}
}

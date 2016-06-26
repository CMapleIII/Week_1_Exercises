/** Program: Converts pounds to kilograms
* File: Exercise2_4.java
* Summary: Converts pounds into kilograms
* Author: Charles Maple III
* Date: June 26, 2016 
**/
import java.util.Scanner;

public class Exercise2_4 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.print("Enter pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.453592;       // A more accurate reading is 1 pound is = to 0.453592 kilogram
		
		System.out.print(pounds + " pounds is " + kilograms + " kilograms");
	}
}

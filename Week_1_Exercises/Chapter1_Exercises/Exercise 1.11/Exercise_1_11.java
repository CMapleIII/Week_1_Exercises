/** Program: Population program
* File: Exercise_1_11.java
* Summary: Displays the population for the next 5 years.
* Author: Charles Maple III
* Date: June 26, 2016 
**/

public class Exercise_1_11 {

	private static double curPopulation = 312032486;
	
	public static void main(String[] strings)
	{
		double BirthrateInSeconds = 7.0;
		double DeathrateInSeconds = 13.0;
		double ImmigrantsInSeconds = 45.0;
		double SecondsInAYear = 60 * 60 * 24 * 365;
		double birthNumbers = SecondsInAYear / BirthrateInSeconds;
		double deathNumbers = SecondsInAYear / DeathrateInSeconds;
		double immigrantNumbers = SecondsInAYear / ImmigrantsInSeconds;
		
		for (int i = 1; i <= 5; i++)
		{
			curPopulation += birthNumbers + immigrantNumbers - deathNumbers;
			System.out.println("year " + i + " = " + (int)curPopulation);
		}
			
	}
}
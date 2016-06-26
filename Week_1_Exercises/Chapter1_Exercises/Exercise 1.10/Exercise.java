/** Program: Kilometers to miles per hour
* File: Exercise.java
* Summary: Converts calculates the speed of a runner in mph based off of the time and distance the runner ran.
* Author: Charles Maple III
* Date: June 26, 2016 
**/
public class Exercise 
{
	public static void main(String[] strings)
	{
		double kilometers = 14.0;
		double miles = kilometers / 1.6;
		
		double rate = (45.5 * 60.0 + 30.0) / (60.0 *60.0);
		double milesperHour = miles / rate;
		
		System.out.println(milesperHour);
	}
}

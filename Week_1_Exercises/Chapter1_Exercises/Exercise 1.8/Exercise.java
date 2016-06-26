/** Program: Area and perimeter of a circle
* File: Exercise1_8.java
* Summary: Finds the area and perimeter of a circle.
* Author: Charles  Maple III
* Date: June 26, 2016 
**/
class Exercise 
{
	public static void main(String[] args)
	{
		double radius = 5.5;
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is: " + area);
		double perimeter = Math.PI * 2 * radius;
		System.out.println("The perimeter of the circle is: " + perimeter);
	}
}

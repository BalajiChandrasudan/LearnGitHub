/*Write a java program to get a number in the console & print its factorial
Factorial 4! = 4*3*2*1 = 21*/

package homework;

import java.util.Scanner;

public class Apr09CC {
	
	public static void main(String[] args) {
	
		{
			// To get the input number
			Scanner obj = new Scanner (System.in);
			System.out.println("Enter the number - ");
			int number = obj.nextInt();
			//Declaring fact & int as 1, such that fact will keep on get multiplied based on i's increment
			int factorial = 1; int i = 1;
						
		while (i <= number)
		{
			factorial = factorial * i;
			i++;
		}	
		// Declaring the final result
System.out.println("The Factorial of "+number+" is "+factorial);
		}}}
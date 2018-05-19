/*Homework for today

Understanding the swapping of numbers, loops and break statement

Print the fibonacci series of numbers until the series reaches 100.

Sample Output:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

Additional - In addition to the while loop, you can also try with an empty for loop 
( for (  ;  ;  ) ) and a break statement inside empty for loop
*/
package homework;

public class Apr4Fibonacci {


public static void main(String[] args) {
	
	int n1 = 0, n2=1, n3=n1+n2;

	System.out.print("The Fibonacci series is "+n1+", "+n2+", ");
	
	while (n3 <=100)
	{
		
		System.out.print(n3+", ");
		n1 = n2;
		n2 = n3;
		n3 = n1+n2;
	
	}
		
			
	
	
	
}}
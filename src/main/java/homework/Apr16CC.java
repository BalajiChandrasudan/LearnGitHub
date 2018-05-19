/*Write a Java Program to print Armstrong number 100 to 1000.. 
 * A 3 digit Armstrong number is a number that is equal to the sum of cubes of its digits. 153 = 1*3+5*3+3*3 = 1+125+27=153 */

package homework;

public class Apr16CC {

	public static void main(String[] args) {

		double total=0;
		
		//Initializing the number as 100
		for (int number = 100; number<=1000; number++)
		{
		//assigning the number to an another variable temp
			int temp = number;
			while (number>0)
			{
				int r=number%10;
				number=number/10;
				total = total+Math.pow(r, 3);
			}
		if (total == temp)
		{
			System.out.println(total);
		}

	    }

}} 

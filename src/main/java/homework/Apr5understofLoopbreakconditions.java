/*Question:;
 * 	Homework for today
	Understanding of loops, break, conditions
	Get a number from user. Print the number. 
	If a prime number is entered, print the number and also the total count of user inputs and then terminate the program.
	Sample Input/Output
	Enter number 1 - 10
	Entered number is 10
	Enter number 2 - 12
	Entered number is 12
	Enter number 3 - 9
	Entered number is 9
	Enter number 4 - 17
	Entered number is 17 - A Prime number
	Total Numbers entered are 4
	Note : Numbers in bold are user inputs.
*/	
package homework;

	
import java.util.Scanner;
	
	public class Apr5understofLoopbreakconditions {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			//Getting input
			int count,j;
			boolean Prime = true;
			Scanner obj = new Scanner (System.in);
			for (count = 1; count <= 4; count++)
		{
			System.out.println("Enter number "+count+ " - ");
			int number = obj.nextInt();			
		
			for (int i =2; i <=  number/2; i++)
			{
				j = number%i;
			    if (j== 0)
			    {		
				Prime = false;
				break;
			    }
			    
			}
			    if (Prime)
			    System.out.println("Entered Number is" +" "+number+" " + "- A Prime Number"); 
			    else
			   	System.out.println("Entered Number is" +" "+ number);		 					
		}
			System.out.println("Total Numbers entered are " + (count-1));
		}
		}
	
					

	
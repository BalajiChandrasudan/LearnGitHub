/*
Home work for today
Understanding Loops and Sysouts
Get an input from the user and print its multiplication table from 1 to 10. 
Enter a Number : 5
The Multiplication Table for 5 is
1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50
*/
package homework;


//Scanner class been imported

import java.util.Scanner;
// April 2nd Programming Challenge 
public class Apr2ProgrmChallng {

	public static void main(String[] args) {
		// To get user input
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int inputNumber = scan.nextInt();
        int i=1, answer;
        
        for (i=1;i<=10; i++)
        {
        	//doing Multiplication
        	answer = i*inputNumber;
        System.out.println(answer);
        scan.close();
        }
        
	}

}

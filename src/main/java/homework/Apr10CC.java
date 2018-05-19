package homework;

import java.util.Scanner;

public class Apr10CC {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number - ");
		int number = obj.nextInt();
		int reverse=0, reminder, print;
		print = number;
		while (number > 0)
		{
			reminder = number%10;
			reverse = (reverse*10)+ reminder;
			number = number/10;
		}		
	//	if (reverse.equalsIgnoreCase = print)
		{
			System.out.println("The number "+print+" is a palindrome");
		}
		//else
			System.out.println("The number "+print+" is not a palindrome");
				
}
}



package homework;

import java.util.Scanner;

public class MAy04Recursive {

	public static void main(String[] args) {
		
		recursive();
	}
	
		private static void recursive() {
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
		System.out.println("The reverse of the number is "+reverse);
	}}

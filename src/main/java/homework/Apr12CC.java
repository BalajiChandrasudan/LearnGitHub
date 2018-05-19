package homework;

import java.util.Scanner;

public class Apr12CC {

	public static void main(String[] args) {
		    String rev = "";
			Scanner obj = new Scanner (System.in);
			System.out.println("Enter the string - ");
			String text = obj.nextLine();
			int number = text.length();
			
			for (int i = number-1; i>=0; i--)	
			{
			rev = rev+text.charAt(i); 	
			}
			if (rev.equalsIgnoreCase(text))
			{
				System.out.println("The entered text "+text+" is Palindrome");
			}
			else
				System.out.println("The entered text "+text+" is not Palindrome");
	}

	}

	
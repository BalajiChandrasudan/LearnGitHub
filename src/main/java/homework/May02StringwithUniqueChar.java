/*Write a simple Java program to identify & form a string with Unique characters*/

package homework;

import java.util.Scanner;

public class May02StringwithUniqueChar {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the string - ");
		String text = obj.nextLine();
		int size = text.length();
		String temp = "";

		for (int i = 0; i<size; i++)
			{
			 if (temp.indexOf(text.charAt(i)) == - 1)
			 {
               temp = temp + text.charAt(i);
		     }					
							
			}					
		System.out.println("The Unique Characters are"+" "+temp); 	
		}
	}

/*//
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
}}//
int[]a = {13,65,15,67,88,65,13,99,67,13,65,87,13};

for (int i = 0; i<=a.length-1; i++)
{
	for (int j = i+1; j<=a.length; j++)
	{
		if (a[i] == a[j])
		
			System.out.println("Duplicate numbers are "+a[i]);	
	}
}					

}*/



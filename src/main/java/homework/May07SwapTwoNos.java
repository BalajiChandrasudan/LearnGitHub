/*Write a Java program to swap two strings without using a third variable*/

package homework;

import java.util.Scanner;

public class May07SwapTwoNos {

	public static void main(String[] args) {
		
	
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the string1 - ");
		System.out.println("Enter the string2 - ");
		String str1 = obj.nextLine();
		String str2 = obj.nextLine();

		//concatenate the two strings
		str1+=str2; 
		
		//here we are getting the exact length of String 1
		str2 = str1.substring(0, (str1.length() - str2.length()));
		
		//string 2 assigned to string 1
		str1 = str1.substring(str2.length());
		
				
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
	}}


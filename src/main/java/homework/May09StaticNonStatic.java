/*Write a Java program to differentiate between static & non-static*/ 

package homework;

import java.util.Scanner;

public class May09StaticNonStatic {

	public static void main(String[] args) {
		
		method1();
		May09StaticNonStatic.method2();
		
	}
	
	
	public static String method1()
	{
		static String str1  = "Hello";
		String str2 = "World";
		System.out.println(str1+" "+str2);
			
	}
	public String method2()
	{
		static String str3  = "Hello";
		String str4 = "World";
		System.out.println(str3+" "+str4);
	}	
	}
	


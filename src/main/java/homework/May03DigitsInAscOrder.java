package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class May03DigitsInAscOrder {

	 
		public static void main(String[] args) {
			
			Scanner obj = new Scanner (System.in);
			System.out.println("Enter the number - ");
			long number = obj.nextLong();
			long temp = number;
			//ArrayList<Integer> number1 = new ArrayList<Integer>();
			Set<Long> number1 = new TreeSet<Long>();
			 
			do{
			    number1.add(temp % 10);
			    temp /= 10;
			} while  (temp > 0);

	for(Long value : number1)
	{
		System.out.println(value);
	}

}}
 
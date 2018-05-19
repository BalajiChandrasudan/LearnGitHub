package homework;

import java.util.Scanner;

public class Apr11CC {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the operation to be performed - ");
		String operation = obj.nextLine();
		Scanner obj2 = new Scanner (System.in);
		System.out.println("Enter the numbers - ");
		int number1 = obj2.nextInt();
		int number2 = obj2.nextInt();
		int result;
		
		switch (operation)
		{
		case "Add": 
			result = number1+number2;
			System.out.println("The result is "+result);
			break;
		case "Sub":
			result = number1-number2;
			System.out.println("The result is "+result);
			break;
		case "Mul":
			result = number1*number2;
			System.out.println("The result is "+result);
		case "Div":
		     result = number1/number2;
		System.out.println("The result is "+result);
		break;
		default :
		     result=number1%number2;
		System.out.println("The result is "+result);
	}

}}

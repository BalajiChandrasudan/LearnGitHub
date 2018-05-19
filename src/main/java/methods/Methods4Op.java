/*Question:
Create a classA with 2 integers(int a,int b) and 4 methods[int add(int a,int b)-->add,sub,mul & div]; 
Create a classB,create an object of classA,call the 4 methods using the object created.
*/


package methods;

public class Methods4Op {

	public static void main(String[] args) {
			}
	public static void Add (int a, int b)
	{
		System.out.println("The Addition of two numbers are:" + (a+b));
		
	}
	public void Sub (int a,int b)
	{
		System.out.println("The Subtraction of two numbers are:" + (a-b));
	}
	public static void Mul (int a,int b)
	{
		System.out.println(" The Multiplication of two numbers are:" + a*b); 
	}
	public void Div (int a,int b)
	{
		System.out.println(" The Division of two numbers are:" + a/b);
	}
	

	}



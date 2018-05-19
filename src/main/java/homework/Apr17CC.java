/*Find the repeated numbers in an Array of Int. int[]a = {13,65,15,67,88,65,13,99,67,13,65,87,13}
The result should be - Duplicated numbers are 13 67 65 */
package homework;

public class Apr17CC {

	public static void main(String[] args) {
		//Declaring the array
		int[]a = {13,65,15,67,88,65,13,99,67,13,65,87,13};
		
		for (int i = 0; i<=a.length-1; i++)
		{
			for (int j = i+1; j<=a.length; j++)
			{
				if (a[i] == a[j])
				
					System.out.println("Duplicate numbers are "+a[i]);	
			}
		}					

	}

}


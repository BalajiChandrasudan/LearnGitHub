/*1. Declare and initialize an int array like below and print the items of the array.

int[] intArr = {1,2,3,4,5};

2. Similarly declare and initialize a two-dimensional array(arrays of arrays) and print it in matrix format like below.
1    2    3    4
5    6    7    8
9    10  11  12

Additional - Get the size of the 2D array
(for above 2D array it is 3 and 4) from the user, and get the values from the user and print it.
*/
package homework;
public class Apr06Arrays {

	public static void main(String[] args) {

		// can also declare us int [] myarray = new int[]{1,2,3}/int[3] which means datatype can be declared as objects
		int [] myArray = {1,2,3,4,5};
		 //To print particular number
		 System.out.println(myArray[2]);
		int index = 0;
				{
			while (index < 5)
			{
				System.out.println(myArray[index]);
				index++;
			}
				}}
	
	/*public static void display (int twoDArray[][])
	{
	int [][] twoDArray = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
			
			for (int i = 0; i <=twoDArray.length; i++)
		{
			for (int j=0; j<=twoDArray[i].length; j++)
			{
			System.out.println(twoDArray [i][j]+"\t");
			}
		System.out.println();
		}
		}
	}*/
	


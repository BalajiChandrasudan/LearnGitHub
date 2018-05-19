/*Write a java program to construct 4*4 Matrix & prinnt the matrix contents in Sprail form
Ex: 1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
    k - starting row index, m - ending row index, l-starting column index, n-ending column index
    */

package homework;

public class Apr30PrintMatrixinSprialForm {

	public static void main(String[] args) {
		
		int [][] matrix = {{1,2,3,4}, {5,6,7,8,},{9,10,11,12},{13,14,15,16}};
		
		for (int i= (matrix.length * matrix [0].length)-1, j=0; i>0; i--, j++)
		{
			for (int k=j; k<i; k++)
			{
				System.out.print(matrix [j][k]);
			}
			for (int k=j ;k<i; k++)
			{
			System.out.print(matrix [k][i]);
			}
			for (int k=i; k>j; k--)
			{
				System.out.print(matrix [i][k]);
			}
	 		for (int k=i; k>j;k--)
			{
				System.out.print(matrix [k][j]);	
			}

		}
}}
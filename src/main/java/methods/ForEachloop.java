/*Question:
	Explore For Each loop over collection of strings. Name 10 people and print the gender of them
*/
package methods;

import java.util.Scanner;

public class ForEachloop {

	public static void main(String[] args) {
		// Declaring the subjects
		String subjects [] = {"English", "Tamil", "Maths", "History","Geography","Social",
				"Civics","Robotics","Nano","Virtual Intelligence"};
		//Declraing integer data type to get each subject IDs
		int subjectLength = subjects.length;
		
		for (subjectLength = 0 ; subjectLength <=9 ; subjectLength++)
		{
			//Scanner scan = new Scanner(System.in);
			//String subjects = scan.next();
			System.out.println("Enter the"+ " " + subjects[subjectLength] +" "+ "mark:");
				
			Scanner scan2 = new Scanner (System.in);
			int Mark = scan2.nextInt();
			if (Mark > 80)
			{
				System.out.println("Distinction");
			}
			else if (Mark > 60 && Mark <80)	
				System.out.println("A Grade");

			else if (Mark > 40 && Mark <60)
				System.out.println("B Grade");
			else if (Mark >35 && Mark <40)
				System.out.println("C Grade");
			else
				System.out.println("F Grade - Fail");

		}
	}
}
	



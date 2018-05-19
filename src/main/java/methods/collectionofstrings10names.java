
/*Question:
	Explore For Each loop over collection of strings. Name 10 people and print the gender of them
*/
package methods;

public class collectionofstrings10names {

	public static void main(String[] args) {
		// Declaring the string
         String name []= {"Raja","Harish","Jaya","Muthu","Mani","Vithiya","Mohan","Susila","Aparna",
        		 "Kasturi"};
         //Assigning the string name lenght to a variable such that to be used in for loop
         System.out.println("The 10 names & correspodning Gender are:");
         int knowNames = name.length;
         int i;
         for (i = 0; i < knowNames; i++)
         {
        //Switch case to callout each name 
			switch(i)
        	 {
        	 case 0: 
        	 System.out.println("Raja is Male");
        	 case 1:
             System.out.println("Harish is Male");
             break;
        	 case 2:
             System.out.println("Jaya is Female");
             break;
        	 case 3:
             System.out.println("Muthu is Male");
             break;
             case 4:
             System.out.println("Mani is Male");
             break;
             case 5:
             System.out.println("Vithiya is Male");
             break;
             case 6:
             System.out.println("Mohan is Male");
             break;
             case 7:
             System.out.println("Susila is Female");
             break;
             case 8:
             System.out.println("Aparna is Female");
             break;
             case 9:
             System.out.println("Kasturi is Female");
             default:
        	 System.out.println("Balaji is Male");
        	 break;
        	 
         }
	}
	}
}

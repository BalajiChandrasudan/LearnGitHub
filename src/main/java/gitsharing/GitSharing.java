package gitsharing;

public class GitSharing {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Program to print next sequence no 
			
			String text1="x1y2a3";
			String str="";
			
			char[] charArray = text1.toCharArray();
			
			for(int i=0;i<=charArray.length-1;i++)
			{
				int ascii= charArray[i];
				ascii = ascii+1;
				char c = (char) ascii;
				
//				charArray=charArray+ascii;
				//System.out.println(c);
				System.out.print(str+c);
				System.out.print("simple");
				
		
			}
			
		}
		
		

	}
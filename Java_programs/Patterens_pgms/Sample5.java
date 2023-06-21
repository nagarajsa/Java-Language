//WAP on patterns Print stars bellow diagram




//                    * 
//                    * * 
//                    * * *
//                    * * * * 
//                    * * * * *


package Patterens_pgms;

public class Sample5
{
   public static void main(String[] args) 
   {
	 for(int i=1; i<=5; i++) // i for loop for rows traversing.
	 {
		 for(int j=1; j<=5; j++)  // j for loop for columns traversing. we can use one more logic is j for loop is dependents on i. for(int j=1; j<=i; j++)
		 {    
			 if(i>=j) 
		    {                             // if(i>=j)
			System.out.print(" *"); 
		    }
		 }
		 System.out.println();
	 }

   }
}

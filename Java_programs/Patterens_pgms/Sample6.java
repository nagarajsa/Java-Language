//WAP on patterns Print stars bellow diagram




//                    * * * * *  
//                    * * * *
//                    * * *
//                    * *
//                    * 

package Patterens_pgms;

public class Sample6
{
   public static void main(String[] args) 
   {
	 for(int i=1; i<=5; i++) // i for loop for rows traversing.
	 {
		 for(int j=1; j<=5; j++)  // j for loop for columns traversing.
		 {  
			 if(i<=j)
			 {
			  System.out.print(" *");
			 }
		 }
		 System.out.println();
	 }

   }
}

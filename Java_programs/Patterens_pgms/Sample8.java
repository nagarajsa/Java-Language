//WAP on patterns Print stars bellow diagram





//                    * * * * *  
//                     * * * *
//                      * * *
//                       * *
//                        *                    


package Patterens_pgms;

public class Sample8
{
   public static void main(String[] args) 
   {
	 for(int i=5; i>=1; i--) // i for loop for rows traversing.
	 {
		 for(int j=5; j>=1; j--)  // j for loop for columns traversing.
		 {  
			 if(i>=j)
			 {
			  System.out.print(" *");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }


	 }
   }



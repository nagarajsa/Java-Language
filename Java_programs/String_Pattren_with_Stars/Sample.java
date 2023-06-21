package String_Pattren_with_Stars;

public class Sample 
{
 public static void main(String[] args)
 {

   for(int i=1; i<=5; i++)
   {
        for(int j=5; j>=1; j--)
       {
       if(i>=j)
       {
    	   System.out.print("*");  // if you want piramid pattren give one space(" *"); 
       }
       else
       {
    	   System.out.print(" ");
       }
	  
	   }
	  System.out.println("  ");
   }

 }
}



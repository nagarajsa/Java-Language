//WAP on patterns Print  bellow diagram



//                    1 1 1 1 1
//                    0 0 0 0 0
//                    3 3 3 3 3
//                    0 0 0 0 0 
//                    5 5 5 5 5

package Patterens_pgms;

public class Sample3 
{
  public static void main(String[] args) 
  {
	 for(int i=1; i<=5; i++)
	 {
		 for(int j=1; j<=5; j++)
		 {
			 if(i%2==0)
			 {
				 System.out.print(" 0");
			 }
			 else
			 {
				 System.out.print(" "+i);
			 }
		 }
		 System.out.println();
	 }
  }
}

//WAP on patterns Print  bellow diagram



//                    1 0 3 0 5
//                    1 0 3 0 5
//                    1 0 3 0 5
//                    1 0 3 0 5 
//                    1 0 3 0 5

package Patterens_pgms;

public class Sample4 
{
  public static void main(String[] args) 
  {
	 for(int i=1; i<=5; i++)
	 {
		 for(int j=1; j<=5; j++)
		 {
			 if(j%2==0)
			 {
				 System.out.print(" 0");
			 }
			 else
			 {
				 System.out.print(" "+j);
			 }
		 }
		 System.out.println();
	 }
  }
}

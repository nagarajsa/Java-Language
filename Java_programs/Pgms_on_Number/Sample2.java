// WAP on Number, sum of the given number. 
package Pgms_on_Number;

public class Sample2 
{
	static void sum(int no)
	{
		int sum=0;
		while(no!=0)
		{
		 int rem=no%10;
		 sum=sum+rem;
		 no=no%10;
		}
		System.out.println("The Sum of the given number is:"+sum);
	}
   public static void main(String[] args) 
   {
	 int no=1234;
	 sum(no);
   }
}

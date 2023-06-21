//Sum of Sum given number till getting 1 digit value.
package Pgms_on_Number;

public class Sample5 
{
	static int call(int no)
	{
		int sum=0;
		
		while(no!=0)
		{
		  int rem=no%10;
		  sum=sum+rem;
		  no=no%10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
	   int no=789;
	  // int copy=no;
	   
	   while(no>9)
	   {
	     no=call(no);
	   }
	     System.out.println(no);
	   
	}

}

//WAP on Sum of Sum numbers using Recursion.
package Pgms_on_Number;

public class Sample7 
{
	static int call(int a)
	{
		int sum=0;
		while(a!=0)
		{
		int rem=a%10;
		sum=sum+rem;
		a=a%10;
		}
		 while(a>9)
		 {
		   return call(sum);
		 }
		return sum;
	}
 public static void main(String[] args) 
 {
	int a=789;
    a=call(a);
	System.out.println(a);
 }
}


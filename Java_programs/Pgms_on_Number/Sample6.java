package Pgms_on_Number;

public class Sample6 
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
		return sum;
	}
 public static void main(String[] args) 
 {
	int a=789;
	while(a>9)
	{
	  a=call(a);
	}
	System.out.println(a);
 }
}

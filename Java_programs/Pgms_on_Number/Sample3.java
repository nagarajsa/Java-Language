package Pgms_on_Number;

public class Sample3 
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
		int no=1234;
		call(no);
		int x=call(no);
		System.out.println("The Sum of given Number is:"+x);
		
	}

}

//WAP on Prime number: Any number which is divisible by 1 either it's self is called as Prime Number.
package Prime_number;

public class Demo1 
{
 public static void main(String[] args) 
 {
	int no=4;
	boolean flag=true;
	
	for(int i=2; i<no; i++)
	{
		if(no%i==0)
		{
		  flag=false;
		  break;
		}
	}
		if(flag==true)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It's not a Prime Number");
		}
 }
}
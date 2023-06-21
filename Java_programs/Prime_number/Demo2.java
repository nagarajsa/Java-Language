//WAP on Prime number and checks the prime range. 1 to 100.
package Prime_number;

public class Demo2 
{
 public static void main(String[] args) 
 {
	for(int j=1; j<=100; j++)
	{
	  int no=7;
	  boolean flag=true;
	
	  for(int i=2; i<no; i++)
	  {
		 if(no%i==0)
		 {
		  flag=false;
		 }
	  }
	  if(flag==true)
	  {
	   System.out.println("It's Prime Number"); 
		 // continue; 
	  }
	  else
	  {
		 System.out.println("It's not a Prime Number");
	  }
	}
 }
}


//WAP on Given the Number is XYLEM number or PLOHEM number
package pgms_on_numbers;

import java.util.Scanner;

public class Sample6 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int num=sc.nextInt();
	  int copy=num;
	  int osum=0;
	  int isum=0;
	  
	  while(num!=0)
	  {
		  if(num==copy || num<10)
		  {
			  osum=osum+num%10;
		  }
		  else
		  {
			 isum=isum+num%10;
		  }
		  num=num/10;
		  
	  }
       
	  if(isum==osum)
	  {
		  System.out.println("XYLEM NUMBER");
	  }
	  else
	  {
		  System.out.println("PLOHEM NUMBER");  
	  }
	}

}

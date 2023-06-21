//WAP on Strong Number: Sum of factorial of is equals number is called Strong Number 145= 5!=120
//                                                                                        4!=24
//                                                                                        1!=1    sum=120+24+1=145
package Strong_number;

public class Strong_num 
{
  public static void main(String[] args) 
  {
	  int no=145;
	  int copy=no;
	  int sum=0;
	  while(no!=0)
	  {
		  int rem=no%10;
		  int no_1=rem;
		  int fact=1;
		  for(int i=no_1; i>=1; i--)
		  {
			fact=fact*i;
		  }
		  sum=sum+fact;
		  no=no%10;
	  }
	  if(copy==sum)
	  {
		  System.out.println(copy+"Number is Strong Number");
	  }
	  else
	  {
		  System.out.println(copy+"Given Number is Not Strong Number");  
	  }
	   
  }
}

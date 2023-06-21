package Factorial_pgm;

class Fact_number 
{
 public static void main(String[] args) 
 {
	int i=5;
	int fact=1;
	
	for(i=5; i>=1; i--)
	{
	  fact=fact*i; 
	}
	System.out.println("The factorial of Five Number is:"+fact);
 }
}

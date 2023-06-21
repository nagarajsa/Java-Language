// given the Number is special digit or not
package pgms_on_numbers;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int num=sc.nextInt();	
	  int d1=num%10;
	  int d2=num/10;
	  int sum=0;
	  sum=d1+d2+(d1*d2);
	  if(sum==num)
		  System.out.println("Special Digit Number");
	  else
		  System.out.println("Not Special Digit Number");
	  

	}

}

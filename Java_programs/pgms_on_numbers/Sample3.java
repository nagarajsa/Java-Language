//WAP on Numbers User Entered input in single digit format.
package pgms_on_numbers;

import java.util.Scanner;

public class Sample3 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int num=sc.nextInt();
	 
	 
	 // if((num>=1 && num<=9) || (num<=-1 && num>=-9))
	 if(num<=9 && num>=-9)
			
	 {
		 System.out.println(num+"is Single digit number");
	 }
	 else
	 {
		 System.out.println(num+"is Not Single digit number");
	 }
	

 }
}

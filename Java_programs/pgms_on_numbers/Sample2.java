//WAP on Numbers, User Entered input  all single digit in number system.
package pgms_on_numbers;

import java.util.Scanner;

public class Sample2 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Start Number");
	 int start=sc.nextInt();
	 System.out.println("Enter the Last Number");
	 int end=sc.nextInt();
	 
	 for(int i=start; i<=end; i++)
	 {
		 if(i<=9 && i>=-9)
		 {
			 System.out.println("The user Entred number is:"+i);
		 }
		 
	 }

 }
}

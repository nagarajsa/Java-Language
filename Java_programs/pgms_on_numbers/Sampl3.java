//WAP on Numbers, User Entered input  all Two digit in number system.
package pgms_on_numbers;

import java.util.Scanner;

public class Sampl3 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Two digit Number");
	 int num=sc.nextInt();
	 
		 if((num<=99 && num>=10) || (num<=-99 && num>=-10))
		 {
			 System.out.println("The user Entred number is:"+num);
		 }
		 


 }
}

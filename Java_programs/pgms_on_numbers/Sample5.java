//WAP on Numbers User Entered input in triple digit format.
package pgms_on_numbers;

import java.util.Scanner;

public class Sample5 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int num=sc.nextInt();
	 
	 
	 // if((num>=1 && num<=9) || (num<=-1 && num>=-9))
	 if(num<=999 && num>=-999)
			
	 {
		 System.out.println(num+"is triple digit number");
	 }
	 else
	 {
		 System.out.println(num+"is Not triple digit number");
	 }
	

 }
}

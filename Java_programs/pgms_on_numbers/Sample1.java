//WAP on Numbers User Entered input in +ve format.
package pgms_on_numbers;

import java.util.Scanner;

public class Sample1 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int num=sc.nextInt();
	 
	 if(num<0)
	 {
		 num=num*-1;
	 }
	 System.out.println("The Number is in +ve format:"+num);
 }
}

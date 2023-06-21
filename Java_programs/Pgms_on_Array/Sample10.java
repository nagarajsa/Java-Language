//WAP on Recursion method with parameter and return type and Dynamic Input.
package Pgms_on_Array;

import java.util.Scanner;

public class Sample10 
{
	static int call(int no) 
	{
	  int d = 0;
      if (no <= 0) 
      {
	   System.out.println("This is Recursion");
	  } 
      else
	  {
		System.out.println(no);
		return call(no-1);
	  }
		return d;
	}
   
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int size = sc.nextInt();
		int no = size;
		call(no);
		int temp = call(no);
		System.out.println(temp);
	}
}

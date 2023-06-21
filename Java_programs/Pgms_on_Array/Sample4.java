                                        //*******Dynamic Inputs on Sum of Array******
package Pgms_on_Array;
import java.util.Scanner;

public class Sample4
{
	static int sum(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
		  sum=sum+arr[i];
		}
		return sum;
	}
	
	
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Array SIZE");
	  int size=sc.nextInt();
	  int[] arr=new int[size];
	  System.out.println("Enter the Array Elements");
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  
	    sum(arr);
	   int x=sum(arr);
	   System.out.println("The Sum of Arry Elements is:"+x);
  }
}

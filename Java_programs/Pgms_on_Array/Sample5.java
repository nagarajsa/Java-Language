                                  //****Sum of array elements even index values 
package Pgms_on_Array;

import java.util.Scanner;

public class Sample5
{
	static int  disp(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				    sum=sum+arr[i];
			}
		}
	    return sum;
	}
	
	
	
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array SIZE");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter array new Element");
	
    for(int i=0; i<arr.length; i++)
    {
    	arr[i]=sc.nextInt();
    }
      
    disp(arr);
	int x=disp(arr);
	System.out.println("The Sum of array elements even values is:"+x);
 }
}

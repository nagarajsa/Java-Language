//WAP on Array method with parameter return type and Dynamic Inputs.
package Pgms_on_Array;
import java.util.Scanner;
public class Sample9 
{
	static int[] rar(int[] arr)
	{
	  return arr;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIZE");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enetr Array Elements:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
	    }
		    rar(arr);
		int[] arr1=rar(arr);
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("The User Enter Array is:"+arr1[i]);
		}
		
	}
}

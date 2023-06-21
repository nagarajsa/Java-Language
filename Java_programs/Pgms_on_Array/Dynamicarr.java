package Pgms_on_Array;

import java.util.Iterator;
import java.util.Scanner;

public class Dynamicarr 
{
	static int[] call(int[] arr1)
	{
		return arr1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size:");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		call(arr1);
		int[] arr2=call(arr1);
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
	
	}

}

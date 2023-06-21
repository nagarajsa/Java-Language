//WAP on Sorting the given number on arrays
package Sorting_num;

import java.util.Arrays;

public class Sort 
{
 public static void main(String[] args) 
 {
	int[] arr={4,5,1,3,2};
	
	Arrays.sort(arr);
	
	System.out.println("Assending order:");
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" "+"\n");
	}
	
	System.out.println("Dissending order:");
	for(int i=arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]+" "+"\n");
	}
 }
 
}

package Pgms_on_Arrays;

import java.util.Arrays;

public class Reverse_array 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int[] ans=new int[arr.length]; //empty array to store reverse elements
		System.out.println("INPUT----->"+Arrays.toString(arr));
		
		for(int i=arr.length-1, j=0; i>=0 && j<ans.length; i--,j++)
		{
			        ans[j]=arr[i];   //swap
		}
           System.out.println("OUTPUT----->"+Arrays.toString(ans));
	}

}

package TWO_D_ARRAY;     //two Dimensional array is one or more arrays, we can store in one single array is called as 2D ARRAY. combination of 1D Array is called as 2D ARRAY. 

import java.util.Iterator;

public class Sample 
{

	public static void main(String[] args) 
	{
		int arr[]= {10, 20, 30};
		int arr1[]= {100, 200, 300, 400};
		int arr2[]= {1000, 2000, 3000, 4000, 5000};
		
		int ans[] []= {arr, arr1, arr2};
		
		for (int i = 0; i < ans.length; i++) 
		{
		 for (int j = 0; j < ans[i].length; j++) 
		 {
			System.out.print(ans[i][j]+" ");
   		 }
		
		System.out.println();
		}
	}

}

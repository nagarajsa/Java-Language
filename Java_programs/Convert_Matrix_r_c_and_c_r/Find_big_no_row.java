package Convert_Matrix_r_c_and_c_r;

import java.util.Arrays;
import java.util.Scanner;

public class Find_big_no_row 
{

	private static int[] BiggestElements(int[][] arr) 
	{
		int big;
		int bigger[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			big=arr[i][0];
			for (int j = 0; j < arr[i].length; j++)
			{
				if(big<arr[i][j])
				{
					big=arr[i][j];
				}
				   
				bigger[i]=big;
			}
		
		}
		return bigger;
	}	
		
	




	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter the Number of Rows:");
		System.out.println("------------------------------------------------------------");
		int rows=sc.nextInt();
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter the Number of Columns:");
		System.out.println("------------------------------------------------------------");
		int colms=sc.nextInt();
		
		int ans[][]=new int[rows][colms];
		for (int i = 0; i < ans.length; i++) 
		{
			for (int j = 0; j < ans[i].length; j++) 
			{
		       ans[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < ans.length; i++) 
		{
			for (int j = 0; j < ans[i].length; j++) 
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("Row wise Biggest elments"+Arrays.toString(BiggestElements (ans)));
		
		
		
		// int res[][]=BiggestElements(ans);
//		 for (int i = 0; i < res.length; i++) 
//		 {
//			 for (int j = 0; j < res[i].length; j++) 
//			 {
//				System.out.println(res[i][j]+" ");
//			 }
//			
//		 }
		
		
		
	 }
	}







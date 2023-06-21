package Convert_Matrix_r_c_and_c_r;

import java.util.Scanner;

public class Sample 
{
    private static int[][] transpose(int[][] arr) 
	{
    	int ans[][]=new int[arr[0].length][arr.length];
    	for (int i = 0; i < ans.length; i++) 
    	{
    		for (int j = 0; j < ans[i].length; j++) 
    		{
    			 ans[j][i]=arr[i][j];
				
			}
			
		}
    	
		
		return ans;
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
		
		System.out.println("Transpose Matrix...!");
		for (int i = 0; i < ans.length; i++) 
		{
			for (int j = 0; j < ans[i].length; j++) 
			{
				System.out.print(ans[j][i]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		 int res[][]=transpose(ans);
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



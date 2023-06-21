package TWO_D_ARRAY;

import java.util.Scanner;

public class Sum_2d_antidiagonal 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no of Colms:");
		int colms=sc.nextInt();
		
		System.out.println("Enter the Elements");
		int ans[][]=new int[rows][colms];
		int sum=0;
		for (int i = 0; i < ans.length; i++) 
		{
			for (int j = 0; j < ans[i].length; j++) 
			{
			     ans[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("After loading.....!");
		for (int i = 0; i < ans.length; i++) 
		{
			for (int j = 0; j < ans[i].length; j++) 
			{
				if(i+j==rows-1)
				sum=sum+ans[i][j];
			}

				 
		}
		System.out.println(sum);
      
	}

}

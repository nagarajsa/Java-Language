package Convert_Matrix_r_c_and_c_r;

import java.util.Scanner;

public class reverse_rowwise 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no of colms:");
	    int colms=sc.nextInt();
	    
	    int ans[][]=new int[rows][colms];
	    System.out.println("Enter the"+"  " +rows*colms+ "  "+"elements.");
	    
	    for (int i = 0; i < ans.length; i++) 
	    {
			for (int j = 0; j < ans[i].length; j++) 
			{
				  ans[i][j]=sc.nextInt();
			}
		}
	    
	    System.out.println("The Elements");
	    for (int i = 0; i < ans.length; i++) 
	    {
			for (int j = 0; j < ans[i].length; j++) 
			{
				  System.out.print(ans[i][j]+" ");     
			}
			System.out.println();
		}
	    
	    
	    System.out.println("Rowwise reverse matrix");
	    
	    for (int i = 0; i < ans.length; i++) 
	    {
			for (int j=ans[i].length-1; j>=0; j--) 
			{
				  System.out.print(ans[i][j]+" ");     
			}
			   System.out.println();

		}
	 
	}

}

package Number_pgms;

import java.util.Iterator;
import java.util.Scanner;

public class Strong_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = scanner.nextInt();
		int copy=num;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			int num1 = rem;
			
			int fact=1;
			for (int i = num1; i >=1; i--) {
			      fact=fact*i;
			}
			 sum=sum+fact; 
			 num=num/10;
		}
		
		if(copy==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}	

	}

}

package Number_pgms;

import java.util.Scanner;

public class Special_two_number {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scanner.nextInt();
		int sum=0;
		int d1=num%10;
		int d2=num/10;
		
		sum=d1+d2+(d1*d2);
		if(sum==num)
		{
			System.out.println("Special two digit");
		}
		else
		{
			System.out.println("Not Special two digit");
		}	
		
		
	}

}

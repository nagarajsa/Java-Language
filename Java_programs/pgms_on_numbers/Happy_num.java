package pgms_on_numbers;

import java.util.Scanner;

public class Happy_num 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int sum;
	while(num>=10)
	{
		sum=0;
		do {
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}while(num!=0);
		
		num=sum;
    }
	
	if(num==1 || num==7)
	{
		System.out.println("Happy Number");
	}
	else
	{
		System.out.println("Not Happy Number");
	}
 }
}

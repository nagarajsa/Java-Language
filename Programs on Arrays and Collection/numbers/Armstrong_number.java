package numbers;

import java.util.Scanner;

public class Armstrong_number {
	
	static int count(int copy)
	{
		int count=0;
		while(copy!=0)
		{
			 copy=copy/10;
			 count++;
		}
		return count;
	}
	
	
	
	
	static int power(int base, int expo)
	{
		int ans=1;
		while(expo!=0)
		{
			ans=ans*base;
		}
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your  Number:");
	    int num =scanner.nextInt();
	    int copy=num;
	    int sum=0;
	    while(num!=0)
	    {
	    	int base=num%10;
	    	sum=sum+power(base, count(copy));
	    	
	    }
	    num=num/10;
	    
	    if(copy==sum)
	    {
	    	System.out.println("ArmStorng Number");
	    }
	    else
	    {
	    	System.out.println("ArmStorng Number");
	    }
	}
	
	

}

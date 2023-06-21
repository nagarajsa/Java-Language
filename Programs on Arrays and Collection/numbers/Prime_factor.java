package numbers;

import java.util.Scanner;

public class Prime_factor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=scanner.nextInt();
		boolean flag=true;
	    //int res=1;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
				
			}
		}
		if(flag) {
			//System.out.println("hii");
			int res=1;
			for(int i=num;i>=1;i--) {
				res=res*i;
			}
			System.out.println("the prime factopr is-->"+res);
		}
		
	}
	

}

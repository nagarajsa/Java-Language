package numbers;

import java.util.Scanner;

public class N_power_P {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base Number:");
		int base = scanner.nextInt();
		System.out.println("Enter Expo Number:");
		int expo = scanner.nextInt();
		int em=expo;
		int ans=1;
		while(expo!=0)
		{
	       ans=ans*base;
	       expo--;
			
		}
		System.out.println("Your ans"+" "+base+" " +"power"+" "+em+" " +"is:");
		System.out.println(ans);
	}

}

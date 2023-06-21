package numbers;

import java.util.Scanner;

public class Digit_numbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scanner.nextInt();
	//if(num<=9) //single digit
	//if(num>=10 && num<=99) //double digit
	 if(num>=99 && num<=999) //triple digit
	{
		System.out.println("This is double digit number:"+num);
	}
	else
	{
		System.out.println("this is not single digit number");
	}
	
}
}

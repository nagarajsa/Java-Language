//WAP on Numbers User Entered input in double digit format.
package pgms_on_numbers;

import java.util.Scanner;

public class Sample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) // if(num<=99 && num>=-99)
		{
			System.out.println(num + "is double digit number");
		} else {
			System.out.println(num + "is Not double digit number");
		}

	}
}

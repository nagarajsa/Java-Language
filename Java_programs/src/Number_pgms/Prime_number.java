package Number_pgms;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		boolean flag = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}

		if (flag == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");

		}

	}

}

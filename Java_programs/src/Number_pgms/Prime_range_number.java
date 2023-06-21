package Number_pgms;

import java.util.Scanner;

public class Prime_range_number {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			int num = j;
			boolean flag = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}

			}

			if (flag == true) {
				System.out.println(num+"Prime Number");
			} else {
				System.out.println(num+"Not Prime Number");

			}
		}

	}

}

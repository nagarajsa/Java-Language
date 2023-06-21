package String;

import java.util.Scanner;

public class Intitial_cap {
	private static int i;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String here.");
		String str = scanner.nextLine();
		str.toLowerCase();
		String[] arr = str.split(" ");
		String ans = null;
		String word = " ";

		for (int i = 0; i < arr.length; i++) {
		

			for (int j = 0; j < arr[i].length(); j++) {
				if (j == 0) {
					char ch = arr[i].charAt(j);
					int x = (int) ch;
					word = word + (char) (x - 32);
				} else {
					word = word + arr[i].charAt(i);
				}

			}

		}
		if (i < arr.length - 1) {
			ans = ans + word + " ";
		}
		else
		{
			ans=ans+word;
		}
		System.out.println(ans);

	}

}

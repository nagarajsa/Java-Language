package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class panagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Sentence:");
		String str = scanner.nextLine();
		str.toLowerCase();
		HashSet hashSet = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				  hashSet.add(ch);
			}
			
		}
		
		if(hashSet.size()==26)
		{
			System.out.println("PANAGRAM");
		}
		else
		{
			System.out.println("NOT PANAGRAM");
		}
	}

}

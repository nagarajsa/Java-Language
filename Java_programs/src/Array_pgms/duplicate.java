package Array_pgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String size:");
	    int size =scanner.nextInt();
		String[] str=new String[size];
		
		System.out.println("Enter string values");
		for (int i = 0; i < str.length; i++) {
			   str[i]=scanner.next();
		}
		System.out.println(Arrays.toString(str));
		
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
		             al.add(str[i]);
		}
		//System.out.println(al);
		
		HashSet<String> hs=new HashSet<String>(al);

		System.out.println(hs);
		Iterator<String> num=hs.iterator();
		while(num.hasNext()) {
			System.out.println(num.next());
		}
		
		
		
	}
}

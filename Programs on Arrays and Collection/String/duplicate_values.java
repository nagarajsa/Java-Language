package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicate_values {
	public static void main(String[] args) {
		String str="Nagaraja";
		String empty=" ";
		
		HashSet hashSet=new HashSet();
		for (int i = 0; i < str.length(); i++) {
			 hashSet.add(str.charAt(i));
		}
		System.out.println(hashSet);
		
		
	}

}

package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Load_string_array_colletion {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter String SIZE:");
		  int size=scanner.nextInt();
		  String [] str=new String[size];
		  System.out.println("Enter String Elements:");
		  for (int i = 0; i < str.length; i++) {
			    str[i]=scanner.next();
			
		}
		  System.out.println(Arrays.toString(str));
		  
		  ArrayList arrayList=new ArrayList();
		  for (int i = 0; i < str.length; i++) {
			  arrayList.add(str[i]);
		}
		 System.out.println(arrayList); 
		  
		  
	}

}

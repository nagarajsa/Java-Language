//WAP on String method with parameter and return type and Dynamic Input
package Pgms_on_String;

import java.util.Scanner;

public class Demo5 
{
	static String call(String str)
	{
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		call(str);
		String temp=call(str);
		System.out.println("The user entered String is:"+temp);
	}

}

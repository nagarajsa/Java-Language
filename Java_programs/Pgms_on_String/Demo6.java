//WAP on String make RING to KING by using replace method, method with parameter return type Dynamic Input.
package Pgms_on_String;
import java.util.Scanner;

public class Demo6 
{
	static String call(String str, String str1, String str2)
	{
		return(str.replace(str1, str2));
		 
	}
		
    public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a String");
	  String str=sc.next();
	  System.out.println("Enter replace character in String");
	  String str1=sc.next();
	  String str2=sc.next();
	  call(str,str1,str2);
	  String temp=call(str,str1,str2);
	  System.out.println(temp);
	}
}

//WAP on String method with parameter and return type
package Pgms_on_String;

public class Demo4 
{
	static String call(String str)
	{
		return str;
	}
	
	
	public static void main(String[] args) 
	{
		call("Hey this is String");
		String temp=call("Hey this is String");
		System.out.println(temp);
	}

}

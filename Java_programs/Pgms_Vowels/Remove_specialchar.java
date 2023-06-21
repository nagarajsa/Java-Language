//WAP to count consonents to given String


package Pgms_Vowels;

import java.util.Scanner;

public class Remove_specialchar
{

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
	    String str="@Naga#raj i!s B@a!D B&#~o@$y!11";
	    String ans=" ";
	    str=str.toLowerCase();
	    int count=0;
	   for (int i = 0; i < str.length(); i++) 
	   {
		 char ch=str.charAt(i);
	     if(ch==' ' || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
	     {
	    	       ans=ans+ch; 
	     }
	
	   }
	   System.out.println(ans);
	}

}

//WAP to print VOWELS in Given String                            VOWEL'S-----> A,E,I,O,U

package Pgms_Vowels;

import java.util.Scanner;

public class Print_vowels
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your String:");
	  String str =sc.nextLine();
	  str=str.toLowerCase();

	  for (int i = 0; i < str.length(); i++) 
	  {
		 char ch=str.charAt(i);	
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			  System.out.println(ch);	 
	  }

	
  }
}

//WAP to count VOWELS in Given String                            VOWEL'S-----> A,E,I,O,U

package Pgms_Vowels;

import java.util.Scanner;

public class Count_vowels
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your String:");
	  String str =sc.nextLine();
	  str=str.toLowerCase();
	  int count=0;
	  for (int i = 0; i < str.length(); i++) 
	  {
		 char ch=str.charAt(i);	
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			 count++;
	  }
	  System.out.println(count);
	
  }
}

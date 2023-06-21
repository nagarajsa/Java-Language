//WAP User Entred vallid Password or not
package Passowor_validation;

import java.util.Scanner;

public class Demo1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------LOGIN Here...!-----------------");
		System.out.println("Password contain's 8 character & 1 Uppercase 1 lowercase & 1 number end's with #");
		System.out.println("Enter your Password Bellow"); 
		String str=sc.next();
		String copy=" ";
		int Ucount=0;
		int Lcount=0;
		int Ncount=0;
		int Scount=0;
		
		if(str.length()>=8)
		{
			for(int i=0; i<str.length(); i++)
			{
		      char ch=str.charAt(i);
		       
		       if(ch>='A' && ch<='Z')
		       {
		    	   Ucount++;
		       }
		       else if(ch>='a' && ch<='z')
		       {
		    	   Lcount++;
		       }
		       else if(ch>='0' && ch<='9')
		       {
		    	   Ncount++;
		       }
		       else
		       {
		    	   Scount++;
		       }
			} 
		    if(Ucount>=1 && Lcount>=1 && Ncount>=1 && Scount>=1 && str.endsWith("#") )
		    {
		      System.out.println("You Entered Vallid Password...!");
		    }
		    else
		    {
		     System.out.println("You Entered Not Vallid Password...!");
		    }
			
		}
		else
		{
		   System.out.println("User Entred Invallid Password...!");
		}
			
		}

  }

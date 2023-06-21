//WAP to count consonents to given String


package Pgms_Vowels;

public class Count_consonents 
{

	public static void main(String[] args) 
	{
	
	    String str="Nagaraja s aralikatti";
	    str=str.toLowerCase();
	    int count=0;
	   for (int i = 0; i < str.length(); i++) 
	   {
		 char ch=str.charAt(i);
		 if(ch>='a' && ch<='z')
		 {
			 if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='o')
			 {
				 count++;
			 }
		 }
		
	   }
	   System.out.println(count);

	}

}

package pgm_on_Strings;

public class Uppr_lowr 
{
  public static void main(String[] args) 
  {
	  String str="AMMA";
	  String str1=" ";
	  
	  for(int i=0; i<str.length(); i++) 
	  {
		char ch = str.charAt(i);
		int num=(int)ch;
	    str1=str1 +(char)(num+32);
		             
	 }
	  System.out.println(str1);
	
  }
}

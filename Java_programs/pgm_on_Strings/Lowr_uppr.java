package pgm_on_Strings;

public class Lowr_uppr 
{
 public static void main(String[] args) 
 {
	String str="appa";
	String copy=" ";
	
	for(int i=0; i<str.length(); i++)
	{
     char ch=str.charAt(i);
     int num=(int)ch;
     copy=copy+(char)(num-32);
     
	}
	System.out.println(copy);
 }
}

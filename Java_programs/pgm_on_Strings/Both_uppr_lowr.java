package pgm_on_Strings;

public class Both_uppr_lowr 
{
 public static void main(String[] args) 
 {
	String str="ApPa";
	String copy=" ";
	
	for(int i=0; i<str.length(); i++)
	{
     char ch=str.charAt(i);
     if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
     {
     int num=(int)ch;
     copy=copy+(char)(num+32);
     }
     
	}
	System.out.println(copy);
 }
}

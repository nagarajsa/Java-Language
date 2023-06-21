
public class revstring_fun 
{
 public static void main(String[] rags) 
 {
	 String str="Naganna";
	 String rev=" ";
	 char[] ch=str.toCharArray();
	 for (int i = ch.length-1; i >= 0; i--) {
		     rev=rev+ch[i];
		
	}
	 System.out.println(rev);
 }
}

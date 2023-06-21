//WAP on Convert String to String 
package Type_casting_pgm;

public class Sample3 
{
 public static void main(String[] args) 
 {
	 String str="abcdef";
	 
	 for(int i=0; i<str.length(); i++)
	 {
	    char ch=str.charAt(i);
		int no=(int)ch+3;
		System.out.print(no+" ");
		
		char ch1=(char)no;
		System.out.println(ch1+" ");
	 }
 }
}

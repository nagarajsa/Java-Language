package String_pgms;

public class String_palindrome {
	public static void main(String[] args) {
		
		String str="appa";
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) {
			  rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}	
	}

}

package String_pgms;

public class Rev_String {
	public static void main(String[] args) {
		
		String str="NAGARAJA";
		String rev=" ";
		
		for (int i = str.length()-1; i>=0; i--) {
			  rev=rev+str.charAt(i);
		}
		System.out.println("The reverse string is:"+rev);
	}

}

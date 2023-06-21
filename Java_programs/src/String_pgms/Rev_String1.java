package String_pgms;

public class Rev_String1 {
	public static void main(String[] args) {
		
		String str="PROGRAM";
		String rev=" ";
		char[] ch=str.toCharArray();
		
		for (int i =ch.length-1; i>=0; i--) {
			  rev=rev+ch[i];
		}
		System.out.println("The reverse string is:"+rev);
	}

}

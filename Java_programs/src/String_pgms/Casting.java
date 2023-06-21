package String_pgms;

public class Casting {
	public static void main(String[] args) {
	
//		char alpha='a';
//		int n=(int)alpha;
//		System.out.println(n);
	
		
		String str="GOD";
	    for (int i = 0; i < str.length(); i++) {
	    	  char ch= str.charAt(i);
	    	          
	    	int num=(int)ch;
	    	char s=(char)num;
	    	char ch1=(char) (s+32);
	    	
	    	   System.out.print(ch1);
		}
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int num=65;
//		char ch=(char) num;
//		System.out.println(ch);
//		
//		int num1=97;
//		char ch1=(char) num1;
//		System.out.println(ch1);
	}

}

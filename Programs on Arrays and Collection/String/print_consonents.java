package String;

public class print_consonents {
	public static void main(String[] args) {
		String str="appa";
		       str.toLowerCase();
		       int count=0;
		for (int i = 0; i < str.length(); i++) {
			 char ch=str.charAt(i);
			 if(ch>='a' && ch<='z')
			 {
			    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
			    {
			    	System.out.println(ch);
			     }
			 
			
			 } 
		}       
	
	}

}

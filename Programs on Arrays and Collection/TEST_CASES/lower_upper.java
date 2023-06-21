package TEST_CASES;

public class lower_upper {
	public static void main(String[] args) {
		String str = "This is Program";
		String ans="";
		String[] arr=str.split(" ");
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			                  
			if( ch>='a' && ch<='z')
			{
				
				         int num=(int)ch;
				         char s=(char)(num-32);
				         System.out.println(s);             
			}
		
		}
             
	}

}

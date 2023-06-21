package String;

public class Sum_integer_string {
	
	public static void main(String[] args) {
		
		String str="KA290MYSORE251";
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			  char ch=str.charAt(i); 
			  
			  if(ch>='0' && ch<='9')
			  {
				  int num=(int)+ch;
				  sum=sum+(ch-48);
			  }
			  
			
		}
		System.out.println(sum);
	}

}

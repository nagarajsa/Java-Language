
public class reverse_word 
{
  public static void main(String[] args) {
	String str="Rama is a good boy";
	String ans=" ";
	String[] arr=str.split(" ");
	for (int i = arr.length-1; i >= 0; i--) {
		         if(i>0)
		         {
		        	 ans=ans+arr[i]+" ";
		         }
		         else
		         {
		        	        ans=ans+arr[i];
		         }
	}
	System.out.println(ans);
}
}

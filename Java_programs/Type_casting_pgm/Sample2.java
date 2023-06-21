//WAP on Convert Character to integer and integer to Character method with parameter
package Type_casting_pgm;

public class Sample2 
{
	static void call(char ch)
	{
		int no=(int)ch+7;
		System.out.println(no);
		
		char ch1=(char)no;
		System.out.println(ch1);
		
	}
   public static void main(String[] args) 
   {
	  call('a');
	
   }
}

package Number_pgms;

public class Number_palindrome {
		public static void main(String[] args) {
			
			int num=1234;
			int copy=num;
			int rev=0;
			
			while(num!=0)
			{
			  int rem=num%10;
			  rev=(rev*10)+rem;
			  num=num/10;
			}
			
			if(copy==rev)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}

	}




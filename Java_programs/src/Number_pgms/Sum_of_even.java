package Number_pgms;

public class Sum_of_even {

		public static void main(String[] args) {
			
			int num=1234;
			int sum=0;
			
			while(num!=0)
			{
			    if(num%2!=0)
			    {
				int rem=num%10;
				sum=sum+rem;
				
			    }
			    num=num/10;
			}
				System.out.println(sum);			
			
		}
	}




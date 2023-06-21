package Basic_pgms;

public class Fizz_Buzz {
	public static void main(String[] args) {
		int num=12;
		
		if(num%3==0 && num%7==0)
		{
			System.out.println("FIZ BUZZ");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz Buzz");
		}
		else if(num%7==0)
		{
			System.out.println("Fizz Buzz");
		}
		else
		{
			System.out.println(" Giv number only Divisible by 3 and 7");
		}
	}

}

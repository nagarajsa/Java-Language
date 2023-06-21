package Basic_pgms;

public class Recursion {
	
	static void recur(int num)
	{
		if(num<=1)
		{
			System.out.println("This is Recurssion calling");
		}
		else
		{
			System.out.println(num);
			recur(num-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		recur(10);
		
	}

}

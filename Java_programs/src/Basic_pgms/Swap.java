package Basic_pgms;

public class Swap {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
	}
}

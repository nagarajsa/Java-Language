package swap_pgm1;

class Swap_2var
{
  public static void main(String[] args)
  {
	int a=10;
	int b=20;
	
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("The a value become:"+a);
	    System.out.println("The b value become:"+b);
  }
}

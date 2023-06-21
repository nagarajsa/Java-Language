package Nested_if_else;

class Nested_if_else 
{
	public static void main(String[] args)
	{
		int a=1000;
		int b=2000;
		
		if(a<=b)
		{
			if(a>=b)
			{
				System.out.println("a is greatter");
			}
			else
			{
				System.out.println("a is lesser");
			}
			
			if(a<b)
			{
				System.out.println("a is lesser than b");
		    }
			else
			{
				System.out.println("b is greatter");
			}
		}
	  else
	  {
		  System.out.println("a is not lesser..");
	  }
		
	}

}

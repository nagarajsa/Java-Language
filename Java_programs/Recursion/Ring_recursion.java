package Recursion;

class Ring_recursion 
{
 static void recur(int no) 
  {
	if (no <= 1) 
	{
	System.out.println("This is Ring recursion");
	} 
	else 
	{
	  System.out.println("The number is:" + no);
	  recur(no - 1);
	}
  }
   public static void main(String[] args)
    {
		recur(10);
	}

}

package Patterens_pgms;

public class Final 
{

	static void pattern1() throws InterruptedException
	{
	 for(int i=1; i<=5; i++) // i for loop for rows traversing.
	 {
		 for(int j=1; j<=5; j++) // j for loop for columns traversing.
		 {
			 Thread.sleep(1000);
			System.out.print(" *"); 
		 }
		 System.out.println();
	 }
	}

	static void pattern2() throws InterruptedException
	{
	 for(int i=1; i<=5; i++) // i for loop for rows traversing.
	 {
		 for(int j=1; j<=5; j++)  // j for loop for columns traversing. we can use one more logic is j for loop is dependents on i. for(int j=1; j<=i; j++)
		 {  
		     if(i>=j)           // if(i>=j)
		    {
				 Thread.sleep(1000);
			     System.out.print(" *"); 
		    }
		 }
		 System.out.println();
	 }
	}
	
	static void pattern3() throws InterruptedException
	{
		for(int i=1; i<=5; i++) // i for loop for rows traversing.
		 {
			 for(int j=1; j<=5; j++)  // j for loop for columns traversing.
			 {  
				 if(i<=j)
				 {
			      Thread.sleep(1000); 
				  System.out.print(" *");
				 }
			 }
			 System.out.println();
		 }

	}
	static void pattern4() throws InterruptedException
	{
		 for(int i=5; i>=1; i--) // i for loop for rows traversing.
		 {
			 for(int j=5; j>=1; j--)  // j for loop for columns traversing.
			 {  
				 if(i>=j)
				 {
					 Thread.sleep(1000);
				  System.out.print(" *");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}
	
	static void pattern5() throws InterruptedException
	{
		for(int i=1; i<=5; i++) // i for loop for rows traversing.
		 {
			 for(int j=5; j>=1; j--)  // j for loop for columns traversing.
			 {  
				 if(i>=j)
				 {
					 Thread.sleep(1000);
				  System.out.print(" *");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }

	}
	
	static void pattern6() throws InterruptedException
	{
		for(int i=1; i<=5; i++)
		   {
			   for(int j=5; j>=1; j--)
			   {
				   if(i>=j)
				   {
					   Thread.sleep(1000);
					   System.out.print(" *");
				   }
				   else
				   {
					   System.out.print(" ");
				   }
			   }
			  System.out.println(); 
		   }
		      
		 for(int i=5; i>=1; i--) // i for loop for rows traversing.
		 {
			 for(int j=5; j>=1; j--)  // j for loop for columns traversing.
			 {  
				 if(i>=j)
				 {
					 Thread.sleep(1000);
				  System.out.print(" *");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN1"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern1();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN2"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern2();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN3"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern3();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN4"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern4();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN5"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern5();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               PATTERN6"                                  );
		System.out.println("-------------------------------------------------------------------------");
		pattern6();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                      !......THYANK YOU......!"                                 );
		System.out.println("-------------------------------------------------------------------------");
	}

}

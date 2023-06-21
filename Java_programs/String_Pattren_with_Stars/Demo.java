package String_Pattren_with_Stars;

public class Demo 
{
	static void a() throws InterruptedException 
	{
		int n=5;
		int x=n;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<2*n; j++)
			{
				if(j==x|| j==n+i-1) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print("*"); 
				}
				else if((j>=x)!=false && j<=n+i-1 && i==n/2+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
	}
	
	
	static void b() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1||((i==1||i==n||i==n/2+1) && j<=n-1)) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else if(i!=1 && i!=n && j==n)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	static void c() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++) //  i for loop for rows
		{
			for(int j=1; j<=n; j++)  // j for loop columns
			{
				if(i==1 || i==n || j==1) // i rows and j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
			}
			System.out.println();
		}
	}
	
	
	static void d() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1 || ((i==1 || i==n) && j<=n-1)) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else if(i!=1 && i!=n && j==n)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void e() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++) //  i for loop for rows
		{
			for(int j=1; j<=n; j++) // j for loop columns
			{
				if(i==1 ||  i==n || j==1 || i==3) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				
			}
			System.out.println();
		}
	}
	
	
	static void f() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || j==1 || i==n/2+1) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void g() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1 || i==1 || i==n || (i>n/2 && j==n) || (i==(n/2+1) && j>n/2)) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void h() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1|| i==n/2+1|| j==n) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void i() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1|| i==n|| j==n/2+1) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void j() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1|| j==n/2+1|| (i==n && j<n/2+1)) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	static void k() throws InterruptedException 
	{
		int n=5;
		int x=n/2+1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n/2+1; j++)
			{
				if(j==1 || j==x) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
				if(i<=n/2)
				{
					x--;
				}
				else
				{
					x++;
				}
			}
			System.out.println();
		}
	}
	
	
	static void l() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1|| i==n) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	static void m() throws InterruptedException 
	{
		int n=5;
		int x=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1|| j==n || ((j==x || j==n-x+1) && i<=n/2+1 )) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			x++;
			System.out.println();
		}
	}
	
	
	static void n() throws InterruptedException 
	{
		int n=5;
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==1|| j==n || i==j) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	static void o() throws InterruptedException 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n|| j==1|| j==n) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	static void p() throws InterruptedException 
	{
		int n=5;
		int x=(n/2)+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((i==1 && j<=x) || j==1 || (j==x && i<=x) || (i==x && j<=x)) // i rows j columns
				{
					//Thread.sleep(100);
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
    public static void main(String[] args) throws InterruptedException 
    {
   	
    	
    	
    	System.out.println("-----------------------A PATTERN---------------------------");
		a();
		
		System.out.println("-----------------------B PATTERN---------------------------");
		b();
    	
    	System.out.println("-----------------------C PATTERN---------------------------");
		c();
		
		System.out.println("-----------------------D PATTERN---------------------------");
		d();
		
		System.out.println("-----------------------E PATTERN---------------------------");
		e();
		
		System.out.println("-----------------------F PATTERN---------------------------");
		f();
		
		System.out.println("-----------------------O PATTERN---------------------------");
		o();
		
		System.out.println("-----------------------H PATTERN---------------------------");
		h();
		
		System.out.println("-----------------------I PATTERN---------------------------");
		i();
		
		System.out.println("-----------------------J PATTERN---------------------------");
		j();
		
		System.out.println("-----------------------L PATTERN---------------------------");
		l();
		
		
    	
    	/*
		String str="hi hello";
		for(int i=0; i<str.length(); i++)
		{
		   char ch=str.charAt(i);
		   switch(ch)
		   {
		   case 'a': a();
		             System.out.println("------------------------------------------------");
			         break;
		   case 'b': b();
                     System.out.println("------------------------------------------------");
	                 break;
		   case 'c': c();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'd': d();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'e': e();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'f': f();
                     System.out.println("------------------------------------------------");
                      break;
		   case 'h': h();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'i': i();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'j': j();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'l': l();
                     System.out.println("------------------------------------------------");
                     break;
		   case 'o': o();
                    System.out.println("------------------------------------------------");
                    break;
                    
                   
		   }
		}
		*/
	}
}

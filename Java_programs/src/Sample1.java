class Sample1
{
	static String reverse(String str)
	{
		if(str.isEmpty())
		{
			//System.out.println("String is empty");
			return str;
		}
		else
		{
			return reverse(str.substring(1))+str.charAt(0);
		}
	}
	
	public static void main(String[] args)
	{
		reverse("JAVA");
		String x=reverse("JAVA");
		System.out.println(x);
		
	}
}
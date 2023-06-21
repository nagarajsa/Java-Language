package Patterens_pgms;

public class Demo1
{
   public static void main(String[] args) throws InterruptedException 
   {
	String str="I GUY'S...!, I WISH YOU ALL, HAPPY NEW YEAR 2023....";
	System.out.println("---------------------WELCOME TO STRING PATTREN'S-------------------------");
	String[] str1=str.split(" ");
	for(int i=0; i<str1.length; i++)
	{
		Thread.sleep(1000);
		System.out.println(str1[i]);
		System.out.println("----------------------------------------------");
	}
	System.out.println("----------------------THANK YOU-------------------");
   } 
}

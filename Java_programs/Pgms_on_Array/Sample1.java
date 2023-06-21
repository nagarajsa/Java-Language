                                      //******Array parameter with return type******.
package Pgms_on_Array;
                         
public class Sample1 
{
	static int[] array(int[] arr)
	{
		return arr;
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] arr={10,20,30,40,50};
		      array(arr);
		int[] arr1=array(arr);
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("The array Elements are:"+arr1[i]);
		}
		
	}

}

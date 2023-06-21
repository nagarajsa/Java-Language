                                    //*******Array with Parameter******.
package Pgms_on_Array;
                                         
public class Sample 
{
	static void array(int[] arr)
	{
	  for(int i=0; i<arr.length; i++)
	  {
		  System.out.println("The array Elements are:"+arr[i]); // array Index address 0,1,2,3,4,5,then print the Array values.
	  }
	}
	
	public static void main(String[] args) 
	{
		int[] arr={10,20,30,40,50}; //Array declaration
		     array(arr);  //method calling and argument passing.
		
		
	}
}

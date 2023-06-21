package Pgms_on_Array;

public class Sum_arr 
{
	static int  call(int[] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
		   sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int[] arr= {10, 20, 30, 40, 50};
        call(arr);
        int x=call(arr);
        System.out.println(x);
	}

}

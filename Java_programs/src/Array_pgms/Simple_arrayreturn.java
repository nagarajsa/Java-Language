package Array_pgms;

public class Simple_arrayreturn {
	
	static int[] call(int arr[])
	{
		return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		call(arr);
		int arr1[]=call(arr);
		for (int i = 0; i < arr1.length; i++) {
			    arr1[i]=arr[i];
			
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}

}

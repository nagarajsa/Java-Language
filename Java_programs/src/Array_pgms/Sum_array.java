package Array_pgms;

public class Sum_array {
	
	static void call(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			  sum=sum+arr[i];	  
			}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		call(arr);
		
		}
	}

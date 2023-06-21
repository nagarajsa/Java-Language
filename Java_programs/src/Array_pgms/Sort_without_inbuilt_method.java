package Array_pgms;

import java.util.Arrays;

public class Sort_without_inbuilt_method {
	public static void main(String[] args) {
		int arr[]= {80, 70, 10, 90, 20, 40, 50, 30, 60, 100, 90};
		int temp;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}

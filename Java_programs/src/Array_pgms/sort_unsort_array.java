package Array_pgms;

import java.util.Arrays;
import java.util.Iterator;

public class sort_unsort_array {
	public static void main(String[] args) {
		int arr[]= {5,6,4,8,1,3,7,9,10,2};
		Arrays.sort(arr);//sort
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {         //even number
			System.out.print(" "+arr[i]);
			}
		}
		
		System.out.println(""); //unsort
		
		for (int i = arr.length-1; i>= 0; i--) {
			if(arr[i]%2!=0) {                //odd number
			System.out.print(" "+arr[i]);
			}
		}
	}

}

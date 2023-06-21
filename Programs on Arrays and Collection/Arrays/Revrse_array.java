package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Revrse_array {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array Size:");
	int size=scanner.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter array elements");
	for (int i = 0; i < arr.length; i++) {
		  arr[i]=scanner.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	
	int ans[]=new int[arr.length];
	for (int i = arr.length-1, j=0; i>=0 && j<=ans.length; i--, j++) {
		    ans[j]=arr[i];
		    System.out.println(ans[j]);
	}
	
		
	}
	
	
}


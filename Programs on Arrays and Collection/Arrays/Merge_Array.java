package Arrays;

import java.util.Arrays;

public class Merge_Array {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7, 8 };
		int arr3[] = { 9, 10, 11, 12 };

		int merg[] = new int[arr1.length + arr2.length + arr3.length];
		for (int i = 0; i < arr1.length; i++) {
			merg[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			merg[arr2.length + j] = arr2[j];
			       
		}

		for (int k = 0; k < arr3.length; k++) {
			merg[arr2.length+arr3.length+k] = arr3[k];
		}

		System.out.println(Arrays.toString(merg));

	}

}

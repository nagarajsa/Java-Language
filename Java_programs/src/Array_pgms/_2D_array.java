package Array_pgms;

public class _2D_array {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int arr3[]= {11,12,13,14,15};
		
		int res[][]= {arr1, arr2, arr3};
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
				
			}
			System.out.println("");

		
		}
	}

}

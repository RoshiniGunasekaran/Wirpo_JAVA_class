package array;

public class task_14 {
	public static void main(String args[]) {
		 int[][] arr = {
		            {1, 23, 45},
		            {55, 121, 222},
		            {56, 77, 89}
		        };

		        System.out.println("The given array is:");
		        int max = Integer.MIN_VALUE;
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(arr[i][j] + " ");
		                if (arr[i][j] > max) {
		                    max = arr[i][j];
		                }
		            }
		            System.out.println();
		        }

		        System.out.println("The biggest number in the given array is: " + max);
	}

}

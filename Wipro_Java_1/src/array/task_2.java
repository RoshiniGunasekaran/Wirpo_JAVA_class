package array;

public class task_2 {
	public static void main(String args[]) {
		 int[] arr = {10, 20, 5, 30, 40};
	        int max = arr[0], min = arr[0];
	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }
	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	}

}

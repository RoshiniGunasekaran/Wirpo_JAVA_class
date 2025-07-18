package array;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 20, 30, 40, 50};
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        double avg = (double) sum / arr.length;
	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);

	}

}

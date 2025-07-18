package array;
import java.util.*;
public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {10, 2, 10, 3};
	        int[] result = new int[arr.length];
	        int index = 0;

	        for (int num : arr) {
	            if (num != 10) {
	                result[index++] = num;
	            }
	        }

	        System.out.println("Modified array: " + Arrays.toString(result));

	}

}

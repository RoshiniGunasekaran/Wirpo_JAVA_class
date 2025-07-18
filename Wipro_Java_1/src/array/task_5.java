package array;
import java.util.*;
public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 1, 8, 9, 2, 3};
        Arrays.sort(arr);
        System.out.println("Smallest 2: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest 2: " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);

	}

}

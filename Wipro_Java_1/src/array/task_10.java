package array;
import java.util.*;
public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 0, 0, 1, 1, 0};
	        List<Integer> even = new ArrayList<>();
	        List<Integer> odd = new ArrayList<>();

	        for (int num : arr) {
	            if (num % 2 == 0) even.add(num);
	            else odd.add(num);
	        }

	        even.addAll(odd);
	        System.out.println("Rearranged: " + even);
	}

}

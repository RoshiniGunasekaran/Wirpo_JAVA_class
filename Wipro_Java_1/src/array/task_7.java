package array;
import java.util.*;
public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("After removing duplicates: " + set);

	}

}

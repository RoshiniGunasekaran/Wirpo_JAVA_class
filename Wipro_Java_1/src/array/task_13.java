package array;
import java.util.*;
public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] arr = {
		            {1, 2},
		            {3, 4}
		        };

		        System.out.println("The given array is:");
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("The reverse of the array is:");
		        for (int i = 1; i >= 0; i--) {
		            for (int j = 1; j >= 0; j--) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }

	}

}

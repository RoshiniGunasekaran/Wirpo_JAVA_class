package flow_control;
import java.util.*;
public class task_14 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();  
	        int sum = 0;
	        while (num > 0) {
	            sum += num % 10;    
	            num = num / 10;     
	        }

	        System.out.println("Sum of digits: " + sum);  
	    }

}

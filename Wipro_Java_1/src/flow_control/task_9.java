package flow_control;
import java.util.*;
public class task_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number");
        }

	}

}

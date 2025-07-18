package flow_control;import java.util.*;
public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int age=sc.nextInt();
		if(str=="Female" && age>=1 || age<=58)System.out.print("Percentage : 8.26 %");
		else if(str=="Female" && age>=59 || age<=100)System.out.print("Percentage : 9.2  %");
		else if(str=="Male" && age>=59 || age<=100)System.out.print("Percentage : 10.5  %");
		else if(str=="Male" && age>=1 || age<=58)System.out.print("Percentage : 8.4  %");
	}

}

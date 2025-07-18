package flow_control;
import java.util.*;
public class task_1 {

	public static void main(String[] args) {
		//a
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) System.out.print("Positive number");
		else if(n==0) System.out.print("Zero number");
		else  System.out.print("Negative Number");
		
		
		//b
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp1=a%10;
		int temp2=b%10;
		if(temp1==temp2)System.out.print("true");
		else System.out.print("False");

	}

}

package flow_control;

import java.util.Scanner;

public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		for(int i=2;i< n/2;i++) {
			if(n%i==0) a++;
		}
		if(a>0) System.out.println("Not a Prime");
		else System.out.print("Prime");

	}

}

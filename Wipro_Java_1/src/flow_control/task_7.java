package flow_control;

import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isLowerCase(c)) {
			char temp=Character.toUpperCase(c);
			System.out.print(temp);
		}
		else {
			char temp=Character.toLowerCase(c);
			System.out.print(temp);
		}

	}

}

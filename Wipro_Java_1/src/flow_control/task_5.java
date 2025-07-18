package flow_control;
import java.util.*;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
		if(Character.isDigit(n)) System.out.print("Digit");
		else if(Character.isLetter(n)) System.out.print("Alphabet");
		else System.out.print("Special character");
	}

}

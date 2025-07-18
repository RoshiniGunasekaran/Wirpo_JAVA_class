package flow_control;

public class task_13 {
    public static void main(String[] args) {
        int n = 99;

        while (n >= 10) {
            int a = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    a++;
                    break;
                }
            }
            if (a == 0) {
                System.out.print(n + " ");
            }
            n--; 
        }
    }
}

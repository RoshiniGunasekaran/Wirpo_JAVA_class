package array;

public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 1, 4};
        boolean isValid = true;

        for (int num : arr) {
            if (num != 1 && num != 4) {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid);

	}

}

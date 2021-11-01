package Day1.Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String num = scanner.nextLine();
        int nums = 0;

        for (int i =0; i < n; i++) {
            nums += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(nums);

    }
}

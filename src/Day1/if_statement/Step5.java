package Day1.if_statement;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        int H;
        int M;
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        M = scanner.nextInt();
        if (M >=45) {
            System.out.println(H+" " +(M - 45));
        }else if (H == 0 && M < 45) {
            System.out.println(23 + " " + (15+M));
        }else if (H == 1 && M < 45) {
            System.out.println(H-1 + " " + (15+M));
        } else if (H > 1 && M <45) {
            System.out.println(H-1 + " " + (15+M));
        }
    }
}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = new String[3];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.next();
        }

        Deque<Character> chars = new ArrayDeque<>();
        for (int i = 0; i < input[0].length(); i++) {
            chars.add(input[0].charAt(i));
        }

        if (input[2].equals("L")) {
            for (int i = 0; i < Integer.parseInt(input[1]); i++) {
                chars.add(chars.pollFirst());
            }
        } else {
            for (int i = 0; i < Integer.parseInt(input[1]); i++) {
                chars.addFirst(chars.pollLast());
            }
        }

        for (int i = 0; i < input[0].length(); i++) {
            System.out.print(chars.pop());
        }
    }
}


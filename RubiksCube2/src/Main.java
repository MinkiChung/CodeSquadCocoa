import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Character> Row1 = new ArrayDeque<>();
        Deque<Character> Row2 = new ArrayDeque<>();
        Deque<Character> Row3 = new ArrayDeque<>();

        Row1.addLast('R');
        Row1.addLast('R');
        Row1.addLast('W');

        Row2.addLast('G');
        Row2.addLast('C');
        Row2.addLast('W');

        Row3.addLast('G');
        Row3.addLast('B');
        Row3.addLast('B');

        Scanner sc = new Scanner(System.in);
        System.out.print("CUBE> ");
        String cmd = sc.next();

        String[] cmds = new String[3];
        for (int i = 0; i < cmds.length; i++) {
            cmds[i] = cmd.charAt(i);
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'U') {

            } else if (input[i].equals("U'")) {

            } else if (input[i] == 'R') {

            } else if (input[i].equals("R'")) {

            } else if (input[i] == 'L') {

            } else if (input[i].equals("L'")) {

            } else if (input[i] == 'B') {

            } else if (input[i].equals("B'")) {

            }


            //출력
            for (
                    int i = 0;
                    i < 3; i++) {
                System.out.print(Row1.pop() + " ");
            }
            System.out.println();

            for (
                    int i = 0;
                    i < 3; i++) {
                System.out.print(Row2.pop() + " ");
            }
            System.out.println();
            for (
                    int i = 0;
                    i < 3; i++) {
                System.out.print(Row3.pop() + " ");
            }


        }


    }

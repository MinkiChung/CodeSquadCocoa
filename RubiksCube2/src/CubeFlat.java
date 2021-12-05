import com.sun.rowset.internal.Row;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CubeFlat {

    Deque<String> Row1;
    Deque<String> Row2;
    Deque<String> Row3;

    //Deque에 초기요소 입력하는 메서드
    CubeFlat() {
        Row1 = new ArrayDeque<>();
        Row2 = new ArrayDeque<>();
        Row3 = new ArrayDeque<>();

        Row1.addLast("R");
        Row1.addLast("R");
        Row1.addLast("W");

        Row2.addLast("G");
        Row2.addLast("C");
        Row2.addLast("W");

        Row3.addLast("G");
        Row3.addLast("B");
        Row3.addLast("B");
    }

    //for문을 통해 Deque의 요소 출력
    void printCube() {
        for (String s : Row1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : Row2) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : Row3) {
            System.out.print(s + " ");
        }
    }


    //큐브 움직임 메서드 구현
    void pushLeftRow1() {
        Row1.addLast(Row1.removeFirst());
    }

    void pushRightRow1() {
        Row1.addFirst(Row1.removeLast());
    }

    void pushUpColumn3() {
        String temp = Row1.removeLast();
        Row1.addLast(Row2.removeLast());
        Row2.addLast(Row3.removeLast());
        Row3.addLast(temp);
    }

    void pushDownColumn3() {
        String temp = Row3.removeLast();
        Row3.addLast(Row2.removeLast());
        Row2.addLast(Row1.removeLast());
        Row1.addLast(temp);
    }

    void pushDownColumn1() {
        String temp = Row3.removeFirst();
        Row3.addFirst(Row2.removeFirst());
        Row2.addFirst(Row1.removeFirst());
        Row1.addFirst(temp);
    }

    void pushUpColumn1() {
        String temp = Row1.removeFirst();
        Row1.addFirst(Row2.removeFirst());
        Row2.addFirst(Row3.removeFirst());
        Row3.addFirst(temp);
    }

    void pushRightRow3() {
        String temp = Row3.removeLast();
        Row3.addFirst(temp);
    }

    void pushLeftRow3() {
        String temp = Row3.removeFirst();
        Row3.addLast(temp);
    }

    void MoveAndPrintCube(ArrayList<String> cmds) {

        for (int i = 0; i < cmds.size(); i++) {
            String cmd = cmds.get(i);
            System.out.print(cmd);
            System.out.println();

            if (cmd.equals("U")) {
                pushLeftRow1();
            } else if (cmd.equals("U'")) {
                pushRightRow1();
            } else if (cmd.equals("R")) {
                pushUpColumn3();
            } else if (cmd.equals("R'")) {
                pushDownColumn3();
            } else if (cmd.equals("L")) {
                pushDownColumn1();
            } else if (cmd.equals("L'")) {
                pushUpColumn1();
            } else if (cmd.equals("B")) {
                pushRightRow3();
            } else if (cmd.equals("B'")) {
                pushLeftRow3();
            }

            printCube();
            System.out.println();
            System.out.println();

        }

    }

}
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 명령어 입력
        Scanner sc = new Scanner(System.in);
        // 세 명령어(1.단어 2.정수 3.L 또는 R) 담는 배열 생성
        String[] input = new String[3];
        // 명령어 담기
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.next();
        }

        // char 담을 deque 생성
        Deque<Character> chars = new ArrayDeque<>();
        // 단어 길이 담는 변수 생성
        int length = input[0].length();
        // 단어를 이루는 각각의 철자 덱에 순서대로 담는다.
        for (int i = 0; i < length; i++) {
            chars.add(input[0].charAt(i));
        }

        //L 또는 R 담는 변수 생성
        String toWhere = input[2];
        //옮길 단어 수
        int howMany = Integer.parseInt(input[1]);
        //L 또는 R 각각의 경우에 대해 철자 옮기기 실행
        if (toWhere.equals("L")) {
            for (int i = 0; i < howMany; i++) {
                chars.addLast(chars.pollFirst());
            }
        } else if (toWhere.equals("R")) {
            for (int i = 0; i < howMany; i++) {
                chars.addFirst(chars.pollLast());
            }
        }

        //출력
        for (int i = 0; i < length; i++) {
            System.out.print(chars.pollFirst());
        }
    }
}


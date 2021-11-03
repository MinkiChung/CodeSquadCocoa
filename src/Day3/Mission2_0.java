package Day3;

import java.util.*;

public class Mission2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 명인가요? ");
        int n = scanner.nextInt();

        List<String> members = Arrays.asList("Autumn", "banglder", "Bart", "BC", "Ben", "bibi", "dale", "Dave", "David", "Dike", "donggi", "Eddy", "Elena", "Ella", "Hanse", "Hemdi", "HJ", "Jace", "Jarry", "Jason", "jee", "Jerry", "Jhin", "Jin", "JinJeon", "Jinnie", "Jisoo", "Ju","Julie", "Jun", "juwon", "jwu", "K", "Khan", "Konda", "Lacon", "LeeJoobang", "Mandoo", "Marco", "Mase", "matthew", "meatsby", "Millie", "Mini", "Mk", "mong", "Moony", "Nick", "Olver", "Oliver Hwang", "OS", "otter", "Phil", "RumbleBi", "S", "Seong", "sol", "sonny", "Sonya", "taksu", "Tany", "Teemo", "turtle", "Yan", "Yellow", "young", "Yuna", "검봉", "노리", "도니", "도비", "도토리", "땃쥐", "반스", "콩", "포키", "피오", "호두마루", "황원상");
        ArrayList<String> memberList = new ArrayList<>();

        memberList.addAll(members); // ArrayList에 모든 값 추가.

        Collections.shuffle(memberList);

        for (int i = 1; i <= n; i++) {
            System.out.print(memberList.get(i)+' ');

        }
    }



}


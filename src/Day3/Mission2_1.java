package Day3;

import java.util.Scanner;

public class Mission2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요>");
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        String yn = "";
        String mn = "";
        String dn = "";

        if (y%10==0) {
            yn = "말 많은 or 시끄러운";
        } else if(y%10==1) {
            yn = "푸른";
        } else if(y%10==2) {
            yn = "어두운, 적색";
        } else if(y%10==3) {
            yn = "조용한";
        } else if(y%10==4) {
            yn = "웅크린";
        } else if(y%10==5) {
            yn = "백색";
        } else if(y%10==6) {
            yn = "지혜로운";
        } else if(y%10==7) {
            yn = "용감한";
        } else if(y%10==8) {
            yn = "날카로운";
        } else if(y%10==9) {
            yn = "욕심많은";
        }

        if (m==1) {
            mn = "늑대";
        } else if (m==2) {
            mn = "태양";
        } else if (m==3) {
            mn = "양";
        } else if (m==4) {
            mn = "매";
        } else if (m==5) {
            mn = "황소";
        } else if (m==6) {
            mn = "불꽃";
        } else if (m==7) {
            mn = "나무";
        } else if (m==8) {
            mn = "달빛";
        } else if (m==9) {
            mn = "말";
        } else if (m==10) {
            mn = "돼지";
        } else if (m==11) {
            mn = "하늘";
        } else if (m==12) {
            mn = "바람";
        }

        if (d==1) {
            dn = "와(과) 함께 춤을";
        } else if (d ==2) {
            dn = "의 기상";
        } else if (d ==3) {
            dn = "은(는) 그림자속에";
        } else if (d ==4) {
            dn = "";
        } else if (d ==5) {
            dn = "";
        } else if (d ==6) {
            dn = "";
        } else if (d ==7) {
            dn = "의 환생";
        } else if (d ==8) {
            dn = "의 죽음";
        } else if (d ==9) {
            dn = "의 아래에서";
        } else if (d ==10) {
            dn = "를(을) 보라";
        } else if (d ==11) {
            dn = "이(가) 노래하다";
        } else if (d ==12) {
            dn = "의 그림자";
        } else if (d ==13) {
            dn = "의 일격";
        } else if (d ==14) {
            dn = "에게 쫓기느 남자";
        } else if (d ==15) {
            dn = "의 행진";
        } else if (d ==16) {
            dn = "의 왕";
        } else if (d ==17) {
            dn = "을 죽인 자";
        } else if (d ==18) {
            dn = "는(은) 맨날 잠잔다";
        } else if (d ==19) {
            dn = "처럼";
        } else if (d ==20) {
            dn = "의 고향";
        } else if (d ==21) {
            dn = "의 전사";
        } else if (d ==22) {
            dn = "은(는) 나의 친구";
        } else if (d ==23) {
            dn = "의 노래";
        } else if (d ==24) {
            dn = "의 정령";
        } else if (d ==25) {
            dn = "의 파수꾼";
        } else if (d ==26) {
            dn = "의 파수꾼";
        } else if (d ==27) {
            dn = "의 악마";
        } else if (d ==28) {
            dn = "와(과) 같은 사나이";
        } else if (d ==29) {
            dn = "를(을) 쓰러트린 자";
        } else if (d ==30) {
            dn = "의 혼";
        } else if (d ==31) {
            dn = "은(는) 말이없다";
        }

        System.out.println("당신의 이름은 " + yn + " " + mn + dn + "입니다.");
    }
}

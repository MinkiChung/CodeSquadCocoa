import java.util.ArrayList;
import java.util.Scanner;

public class Prompt {

    //프롬프트에 입력받고 runPrompt() 호출
    void showPrompt() {
        CubeFlat cubeFlat = new CubeFlat();
        cubeFlat.printCube();

        System.out.println();
        System.out.print("CUBE> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("Q")) {
            System.out.println("Bye~");
            System.exit(0);
        } else if (!input.equals("Q")) {
            runPrompt(cubeFlat, input);
        }
    }

    //입력값에 해당하는 명령어 실행.
    void runPrompt(CubeFlat cubeFlat, String input) {
        ArrayList<String> cmds = cmdConversion(input);
        cubeFlat.MoveAndPrintCube(cmds);
    }

    //Prompt 입력값에서 실질적으로 이행해야 하는 명령 모은 ArrayList 반환
    ArrayList<String> cmdConversion(String cmdLine) {
        ArrayList<String> cmds = new ArrayList<>();

        for (int i = 0; i < cmdLine.length(); i++) {
            String CharInStr = Character.toString(cmdLine.charAt(i));
            cmds.add(CharInStr);

            if (CharInStr.equals("'")) {
                int quoteId = cmds.indexOf("'");
                cmds.remove(quoteId);
                cmds.set(quoteId - 1, (cmds.get((quoteId - 1)) + "'"));
            }
        } // for문 끝
        return cmds;
    }


}

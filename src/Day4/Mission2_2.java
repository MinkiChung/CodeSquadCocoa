package Day4;

import java.util.ArrayList;
import java.util.Collections;

public class Mission2_2 {
    public static void main(String[] args) {
        int[][] puzzle = new int[4][4];

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            nums.add(i);
        }

        Collections.shuffle(nums);

        for (int l = 0; l < 16; l++)
            if (l / 4 == 0) {
                puzzle[0] = nums.get(l);
            }

        }


    }


}

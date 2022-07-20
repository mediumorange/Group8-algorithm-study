package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class no_33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int [] answer = {};
        int luckynum = 0;
        int unlucknum = 0;

        ArrayList <Integer> win = new ArrayList<Integer>(Arrays.stream(win_nums).boxed().collect(Collectors.toList()));
        for (int i : lottos) {
            if (win.contains(i)) {
                ++luckynum;
                ++unlucknum;
            }
            else if (i == 0) {
                ++luckynum;
            }
        }

        luckynum = 7-luckynum;
        unlucknum = 7-unlucknum;
        if(luckynum >= 6) luckynum = 6;
        if(unlucknum >= 6) unlucknum = 6;

        answer = new int[]{luckynum, unlucknum};

        return answer;
    }

    public static void main(String[] args) {
        no_33 so = new no_33();
        int [] lot = {44, 1, 0, 0, 31, 25};
        int [] win = {31, 10, 45, 1, 6, 19};
        System.out.println(so.solution(lot,win));
    }
}

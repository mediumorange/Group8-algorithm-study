package algorithm;

import java.util.Arrays;

public class no_30 {

    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int imax = 0;
        int jmax = 0;
        for (int[] i : sizes) {
            if (i[0] < i[1]) {
                temp = i[0];
                i[0] = i[1];
                i[1] = temp;
            }
        }

        for (int[] i : sizes) {
            imax = Math.max(i[0],imax);
            jmax = Math.max(i[1],jmax);
        }


        return imax*jmax;


    }

    public static void main(String[] args) {
        int[][] a = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };


        no_30 so = new no_30();
        System.out.println(so.solution(a));
    }
}

package algorithm;

import java.util.Arrays;

public class dddd {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {

            int b = arr[0];
            int j = 0;
            for (int a : arr) {

                if (a > b) {
                    answer[j] = a;
                    j++;
                }
                else if (a < b) {
                    answer[j] = b;
                    b = a;
                    j++;
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, -4, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

}

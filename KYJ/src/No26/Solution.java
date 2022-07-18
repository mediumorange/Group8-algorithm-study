package No26;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if (arr.length == 1) {
            answer = new int[] {-1};
        } else {
            // 가장 작은 수 찾기
            int min = arr[0];
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }

            // min 제외한 배열 만들기
            int index = 0;
            for (int i : arr) {
                if (i > min) {
                    answer[index] = i;
                    index++;
                }
            }
        }
        return answer;
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[]arr = {5, 2, 1, 4, 8};
        System.out.println(Arrays.toString(sol.solution(arr))); //
    }
}
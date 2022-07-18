package No14_test;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i : arr) {
            if (i % divisor == 0) {
                arrList.add(i);
            }
        }
        int[] answer = new int[arrList.size()];
        Collections.sort(arrList);
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        int[] error = {-1};
        return (answer.length != 0) ? answer : error;
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {6, 7, 4, 8, 5, 11};
        int divisor = 2;

        int[] a = sol.solution(arr, divisor);
        System.out.println(Arrays.toString(a));
    }
}
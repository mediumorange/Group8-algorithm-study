package No14;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int[] answer;

        //나누어 떨어지는 값으로 배열 만들기
        for (int i : arr) {
            if (i % divisor == 0) count++;
        }
        if (count == 0) {   //나누어 떨어지는 값이 없을 경우
            answer = new int[] {-1};
        } else {
            answer = new int[count];
            int cnt = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
        }
        //오름차순 정리
        Arrays.sort(answer);
        return answer;
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {6,7,4,8,5,11};
        int divisor = 2;

        int[] a = sol.solution( arr, divisor );
        System.out.println(Arrays.toString(a));
    }
}
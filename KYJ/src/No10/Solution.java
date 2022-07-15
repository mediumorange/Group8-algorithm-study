package No10;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i =0; i< arr1.length; i++) {
            for (int j =0; j< arr1[0].length; j++) {
                int a1 = arr1[i][j] + arr2[i][j];
                answer[i][j] = a1;
            }
        }

        return answer;
    }

//    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{1,2,3}, {2,3,4}}; // 예제
        int[][] arr2 = {{3,4,5}, {5,6,7}}; // 예제

        int[][] a = sol.solution( arr1, arr2 );
        System.out.println(Arrays.deepToString(a));
    }
}
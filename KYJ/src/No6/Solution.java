package No6;

public class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i=0; i<numbers.length; ++i) {
            sum += numbers[i];
        }
        return 45 - sum;
    }

//    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {0,1,2,3,4,5,6,7,8,9}; //
        System.out.println(sol.solution( numbers ));
    }
}

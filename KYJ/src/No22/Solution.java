package No22;

public class Solution {
    public int solution(int n) {
        String digit = Integer.toString(n);
        int divisor = (int) Math.pow(10, digit.length()-1);
        int answer = 0;
        for (int i =0; i<digit.length(); i++) {
            int m = n/divisor;
            answer += m;

            n -= m*divisor;
            divisor /= 10;
        }

        return answer;
    }

//    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(62343423)); //
    }
}


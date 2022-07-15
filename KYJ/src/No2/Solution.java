package No2;

public class Solution {
    public String solution(int num) {
        String answer = (num % 2 == 0) ? "Even" : "Odd"; //삼항연산자로 간단하게 표현
        return answer;
    }
    //public String solution(int num) {
    //    if (num % 2 == 0) {
    //        String answer = "Even";
    //        return answer;
    //    } else {
    //        String answer = "Odd";
    //        return answer;
    //    }
    //}

//    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6)); //
    }
}


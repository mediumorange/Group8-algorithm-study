package No18;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public String solution(String[] seoul) {
        String location = null;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                location = Integer.toString(i);
            }
        }
        String answer = String.format("김서방은 %s에 있다", location);
        return answer;
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] seoul = {"r", "a", "Kim", "hi"};
        System.out.println(sol.solution(seoul));
    }
}
package algorithm;

import java.util.ArrayList;

public class algoritm_test {
    public String solution(int n) {
        String answer = "";
        ArrayList <Integer> ans = new ArrayList<>();
        int sum = 0;
        while ( n > 0) {
            ans.add(n%10);
            sum += n % 10;
            n /= 10;
        }

        int b = 1;

        for (int i : ans) {
            if (b == ans.size()) {
                answer += i+"="+sum;
            }
            else {
                answer += i + "+";
                ++b;
            }
        }


        return answer;
    }


    public static void main(String[] args) {

        algoritm_test method = new algoritm_test();
        System.out.println(method.solution(1532576));


    }
}

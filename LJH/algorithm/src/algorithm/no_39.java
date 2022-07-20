package algorithm;

public class no_39 {


    public String solution(String s, int n) {
        String answer = "";
        int b = 0;
        char a;
        for (int i = 0; i < s.length(); i++) {
            b = (int) s.charAt(i) + n;
            System.out.println(b);
            if (s.charAt(i) == ' ') {  //공백일때
                answer += s.charAt(i);
            } else {
                if (s.charAt(i) >= 65 & s.charAt(i) <= 90) {  //대문자일때
                    if (b > 90) {
                        b = b - 26;
                        a = (char) b;
                        answer += a;
                    }
                   else {
                        a = (char) b;
                        answer += a;
                    }
                } else {                  //소문자일때
                    if (b > 122) {
                        b = b - 26;
                        a = (char) b;
                        answer += a;
                    }
                    else {
                        a = (char) b;
                        answer += a;
                    }
                }
            }
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        no_39 so = new no_39();
        so.solution("aBz Z", 4);

    }
}

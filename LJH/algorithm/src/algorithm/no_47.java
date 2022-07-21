package algorithm;

public class no_47 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            for(int k = 2; k <i; k++ ) {
                if (i % k != 0) {
                    ++answer;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        no_47 so = new no_47();
        System.out.println(so.solution(10));


    }
}

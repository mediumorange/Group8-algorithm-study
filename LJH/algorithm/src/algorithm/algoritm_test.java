package algorithm;

public class algoritm_test {

    public static int solution(int chin[], int chout[]) {
        int answer = 0;

        for (int i = 0; i < 7; i++) {
            if (chout[i] >= 29) { // 새벽 5시정각이나 이상일때
                answer += 21 - chin[i];
            } else {
                answer += chout[i] - chin[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int [] a = {9, 9, 9, 9, 7, 9, 8};
        int [] b = {23, 23, 30, 28, 30, 23, 23};

        System.out.println(solution(a,b));

    }
}

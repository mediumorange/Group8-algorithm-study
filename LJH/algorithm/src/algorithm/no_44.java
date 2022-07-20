package algorithm;

public class no_44 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int maxn = 0;
        int minn = 1;

        for (int i = 1; i <= min; i++) {
            if (min % i == 0 & max % i == 0) {
                minn = i * (min / i) * (max / i);
                maxn = i;
            }
        }

        answer[0] = maxn;
        answer[1] = minn;

        return answer;
    }

    public static void main(String[] args) {
        no_44 so = new no_44();
        System.out.println(so.solution(2,5));
    }
}

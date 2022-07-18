package Ex13;

public class Ex13 {
    public String solution(int a, int b) {
        int[] daysinmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysinweek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int totaldates = 0;
        for (int i = 0; i < a; i++) {
            if (i == 0) {
                totaldates = b;
            } else {
                totaldates += daysinmonth[i - 1];
            }
        }
        System.out.println(totaldates);
        String answer = daysinweek[totaldates % 7];
        return answer;
    }

    public static void main(String[] args) {
        Ex13 sol = new Ex13();
        System.out.println(sol.solution(5, 24));
    }
}
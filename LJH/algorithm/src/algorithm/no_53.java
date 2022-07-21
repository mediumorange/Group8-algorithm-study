package algorithm;

public class no_53 {
    public int solution(String dartResult) {
        String temp = "";
        int[] n = new int[3];
        int idx = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '*':
                    n[idx - 1] *= 2;  //직전의 값에다가 *2
                    if (idx > 1) {
                        n[idx - 2] *= 2; // 직전의 전까지도 *2
                    }
                    break;

                case '#':
                    n[idx - 1] *= -1;  //방금 들어온값 *(-1)
                    break;

                case 'S':
                    n[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
                    idx++;
                    temp = "";
                    break;

                case 'D':
                    n[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
                    idx++;
                    temp = "";
                    break;
                case 'T':
                    n[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
                    idx++;
                    temp = "";
                    break;
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;

            }
        }


        int answer = 0;
        answer = n[0] + n[1] + n[2];
        return answer;
    }

    public static void main(String[] args) {

        no_53 so = new no_53();
        System.out.println(so.solution("1S2D*3T"));

    }
}

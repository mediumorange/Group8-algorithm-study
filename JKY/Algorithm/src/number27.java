//알고리즘 작성 : 콜라즈 추측
public class number27 {
    public int number27(long num) {
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num * 3 + 1;
            }
            answer++;
            if(answer==500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
// 주어진 예제, 출력용
    public static void main(String[] args) {
        number27 sol = new number27();
        long num = 626331;
        System.out.println(sol.number27(num));
    }
}
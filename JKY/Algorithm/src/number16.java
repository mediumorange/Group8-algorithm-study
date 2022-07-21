// 알고리즘 작성 : p, y 개수 동일한지 확인하기
public class number16 {
    boolean number16(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            if (arr[i].equals("p")||arr[i].equals("P")){
                p++;
            }else if (arr[i].equals("y") || arr[i].equals("Y")){
                y++;
            }
            if (p == y){
                answer = true;
            }else {
                answer = false;
            }
        }
        return answer;
    }

    //주어진 예제 , 출력용
    public static void main(String[] args) {
        number16 sol = new number16();
        String s = "pPoooY";
        System.out.println(sol.number16(s));
    }
}

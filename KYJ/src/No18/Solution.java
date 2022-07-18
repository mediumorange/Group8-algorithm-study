package No18;

public class Solution {
    public String solution(String[] seoul) {
//        String location = null;
        int a = 0; //
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                a = i; //
//                location = Integer.toString(i);
            }
        }
        return "김서방은 "+a+"에 있다"; //
//        return String.format("김서방은 %s에 있다", location);
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] seoul = {"r", "a", "Kim", "hi"};
        System.out.println(sol.solution(seoul));
    }
}
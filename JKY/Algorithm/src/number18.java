public class number18 {
    public String number18(String[] seoul) {
        String answer = "";
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은"+(i+1)+"에 있다";
                System.out.println(answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        number18 sol = new number18();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(sol.number18(seoul));
    }
}

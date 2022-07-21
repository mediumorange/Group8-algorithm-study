//알고리즘 작성 : 문자열 다루기  ------ 미완성 테스트 5,6 번 안됨(s의 길이 제한을 안해서 그런듯)
class number17 {
    public boolean number17(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        final String REGEX = "[0-9]+";
        if (s.matches(REGEX)) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    //주어진 예제, 출력용
    public static void main(String[] args) {
        number17 sol = new number17();
        String s = "a1234";
        System.out.println(sol.number17(s));
    }
}

package No21;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        int index = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] != ' ') {
                char a = (index % 2 == 0) ? Character.toUpperCase(arr[i]) : Character.toLowerCase(arr[i]);
                arr[i] = a;
                index ++;
            } else {
                index = 0;
            }
        }
        return new String(arr);
    }

    //    확인용
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(""));
    }
}
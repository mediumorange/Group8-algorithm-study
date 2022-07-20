package algorithm;

public class no_40 {
    public String solution(String new_id) {
        String answer = "";
        String s = "[^a-z\\d\\-_.]*";
        answer = new_id.toLowerCase();                     //case1
        answer = answer.replaceAll(s,"");       //case2
        answer = answer.replaceAll("\\.{2,}",".");  //case3
        StringBuffer ans = new StringBuffer(answer);

        if(ans.charAt(0) == '.' ) {   //case4
            ans.deleteCharAt(0);
        }


        if(ans.length() == 0) {
            ans.append("a");
        }
        else if (ans.charAt(ans.length()-1) == '.') {
            ans = ans.deleteCharAt(ans.length()-1);
        }

        answer = ans.toString();

        if(answer.length()>15) {             //case6
            answer =answer.substring(0,15);
            if (answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0,14);
            }
        }

        if(answer.length() <= 2){             //case7
            while (answer.length() != 3) {
                answer+= answer.substring(answer.length()-1,answer.length());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        no_40 so = new no_40();
        System.out.println(so.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}

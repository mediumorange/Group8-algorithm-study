package algorithm;

public class no_40 {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();      //case1
        answer = answer
                .replaceAll("[^a-z\\d\\-_.]*","")    //case2
                .replaceAll("\\.{2,}",".")           //case3 z-.
                .replaceAll("^[.]|[.]$","");                //case4

        if(answer.length() == 0) {   //case5
            answer = "a";
        }

        if(answer.length()>15) {             //case6
            answer =answer.substring(0,15);
            if (answer.charAt(answer.length()-1) == '.') {
                answer = answer.replaceAll(".$","");
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
        System.out.println(so.solution("abcdefghijklmn.p"));
    }
}

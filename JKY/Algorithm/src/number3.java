public class number3 {
    public String solution(String s) {
        String a = "";

        if(s.length()%2==1) {
            a = s.substring(s.length()/2,s.length()/2+1);
        } else {

            a = s.substring(s.length()/2-1, s.length()/2+1);
        }

        return a;
    }
}

// 가운데 글자 가져오기
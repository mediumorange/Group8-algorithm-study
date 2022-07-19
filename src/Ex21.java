class Ex21 {
        public String solution(String s) {
            String[] splitStr = s.split("\\s+");
            char[] tochar;
            String answer = "";
            for (int i = 0; i < splitStr.length; i++) {
                tochar = splitStr[i].toCharArray();
                for (int j = 0; j < tochar.length; j++) {
                    if (j % 2 == 0) {
                        tochar[j] = Character.toUpperCase(tochar[j]);
                    } else {
                        tochar[j] = Character.toLowerCase(tochar[j]);
                    }
                }
                answer += String.valueOf(tochar) + " ";
            }
            answer = answer.trim();
            return answer;
        }
    //the reason why this code couldn't pass the coding test
    //one of the conditions given were that there can be more than one space in between the words
    //ex) hi  this is  bob ->Hi  ThIs Is  BoB
    //by using the split and stripping all the spaces, can't reconstruct the statement as it was
    //(go to Ex21_help)


    public static void main(String[] args) {
        Ex21 sol = new Ex21();
        System.out.print(sol.solution("I LOVE YOU"));
    }
}
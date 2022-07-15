package algorithm;

import java.util.Arrays;

public class 완주하지못한선수 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        String[] par = {"a","b","c","d"};
        String[] com = {"a","b","c"};
        int num = 0;
        for (String i : par) {
        	if(!i.equals(com[num])) {
        		answer = i;
        		break;
        	}
        }
        
        
        return answer;

        
    }

	public static void main(String[] args) {
		String[] par = {"a","b","c","d"};
        String[] com = {"a","b","c"};
        System.out.println("a".equals(com[0]));
		
		  
	}

}

package algorithm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


 // array ["a","b","c"]   O(n)
 // Hashset {"a" : value, "b" : value, "c": value}  O(1)

public class 완주 {
	
	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		HashMap<String, Integer> par = new HashMap<>();
        int target = 1;
		
        for (int i =0;i<participant.length; i++) {
        	String name = participant[i];
        	if (!par.containsKey(name)) {
        		par.put(participant[i],1);  // 기본적으로 참가자들의 value를 1로 설정
        	}     		
        	else {
        		target = par.get(name);
        		par.put(name,++target);  // 만약 중복된 참가자가 있으면 ++target으로 설정
        	}
        	
        }

        System.out.println(par);

        for (int i = 0; i<completion.length;i++) {
        	
        	String name = completion[i];
        	target = par.get(name);
        	if (target == 1) {
        		par.remove(name);      //완주자에 참가자가 포함됐다면 지워주기
        	}
        	else {
        		par.put(name,--target);  // target이 1이 아니면 중복된 참가자이므로 value값을 1낮춰줌
        	}    	
        }

		System.out.println(par);
        Set<String>keys = par.keySet();
        String key = keys.toString();
        answer = key.substring(1,key.length()-1);
        
        return answer;

        
    }

	public static void main(String[] args) {
		
        String[] par = {"a","a","b","c"};
        String[] com = {"a","a","c"};
		System.out.println(solution(par,com));
	}

}

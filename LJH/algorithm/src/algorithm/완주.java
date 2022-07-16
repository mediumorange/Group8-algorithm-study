package algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class øœ¡÷ {
	
	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
        Map<String, Integer> par = new HashMap<>();
        int target = 1;
		
        for (int i =0;i<participant.length; i++) {
        	String name = participant[i];
        	if (par.containsKey(name)) {
        		target = par.get(name);
        		par.put(name,++target);
        	}     	
        	
        	else {
        		par.put(participant[i],1);	
        	}
        }
        for (int i = 0; i<completion.length;i++) {
        	String name = completion[i];
        	target = par.get(name);
        	System.out.println("par"+par);
        	if (target == 1) {
        		par.remove(name);
        	}
        	else {
        		par.put(name,--target);
        		
        	}
        	
        	
        }
        
        Set<String>keys = par.keySet();
        String key = keys.toString();
        answer = key.substring(1,key.length()-1);
        
        return answer;

        
    }

	public static void main(String[] args) {
		
        String[] par = {"a","b","c"};
        String[] com = {"a","b"};
       
		

		System.out.println(solution(par,com));
		
   
		
		  
	}

}

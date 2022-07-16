package algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class 완주하지못한선수 {
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		
		ArrayList<String> par = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> com= new ArrayList<String>(Arrays.asList(completion));

        
        for (String i : com) {
        	if (par.contains(i)) {
        		par.remove(i);
        
        	}
        	
        
        }
        
        answer = par.get(0);

        return answer;

        
    }

	public static void main(String[] args) {
        String[] par = {"a","b","a","c"};
        String[] com = {"b","c","a"};
		

		
		System.out.println(solution(par,com));
		
        
		
		  
	}

}

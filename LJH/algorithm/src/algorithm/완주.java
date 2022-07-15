package algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class øœ¡÷ {
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		
		ArrayList<String> par = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> com= new ArrayList<String>(Arrays.asList(completion));
 
    
        
        for(String i : com) {
        	
        	par.remove(i);
        	
        }
        
       
        answer = par.get(0);
        return answer;

        
    }

	public static void main(String[] args) {
        String[] par = {"a","a","c","d"};
        String[] com = {"a","d","c"};
       
		

		
		System.out.println(solution(par,com));
		
        
		
		  
	}

}

package algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class �����������Ѽ��� {
	
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
		String[] par = {"a","a","b","c"};
		String[] com = {"a","b","c"};
		System.out.println(solution(par,com));

	}

}

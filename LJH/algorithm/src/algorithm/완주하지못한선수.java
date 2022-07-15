package algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class 완주하지못한선수 {
	
	public static String solution(String[] participant, String[] completion) {
        
		String answer = "";
        String[] par = {"a","b","c","d"};        
        String[] com = {"a","b","c"};
		List<String> par1 =new ArrayList<>(Arrays.asList(par)) ;
		List<String> com2 =new ArrayList<>(Arrays.asList(com)) ;

        int num = 0;
        
        for (String i : par) {
        	if (!Arrays.asList(com).contains(i)) {
        		answer = i ;
        		break;
        		
        	}
        	
        }
        
        
        return answer;

        
    }

	public static void main(String[] args) {
        String[] com = {"a","b","c"};
		List<String> list =new ArrayList<>(Arrays.asList(com)) ;
		list.remove("c");
		
		System.out.println(list);
		
		
		int getIndex = Arrays.asList(par).indexOf(3);
		
        System.out.println(getIndex);
        
       System.out.println(solution(par,com));
		
		  
	}

}

package algorithm;

import java.util.Collections;
import java.util.ArrayList;


public class 내림차순정렬 {
	public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<String> arrList2 = new ArrayList<String>();
        String sanswer = "";

        String to = Long.toString(n);
             
        for (int i = 0;  i<to.length(); i++) {
            arrList.add(to.charAt(i) -'0');
        }
        
       Collections.sort(arrList, Collections.reverseOrder());
       
       for(int i : arrList) {
    	   arrList2.add(Integer.toString(i));
       }
       
       for (String i : arrList2) {
    	  
    	   sanswer = sanswer.concat(i);
       }
       answer = Long.parseLong(sanswer);
       

        return answer;
        
        
    }
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(7754134));
	
	
	}

}

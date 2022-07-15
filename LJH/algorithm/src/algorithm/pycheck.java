package algorithm;

public class pycheck {
	private static boolean solution(String s) {
		
        boolean answer = true;
        String str = new String("");
        str = s.toUpperCase();
        
        int pnum = 0;
        int ynum = 0;

        for (int i= 0; i < str.length(); i++) {
 
        	if (str.charAt(i) == 'P') {
        	
        		++pnum;
        	}
        	
        	else if (str.charAt(i) == 'Y') {
        		++ynum;
        	}
        	
        }

        answer = (pnum == ynum) ?  true :false ;

        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution("ppdqyyy"));
		
		

	}

}

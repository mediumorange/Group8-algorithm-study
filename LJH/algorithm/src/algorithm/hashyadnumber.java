package algorithm;

public class hashyadnumber {
	
	    private static boolean solution(int x) {
	        boolean answer = true;
	        String number = Integer.toString(x);
	        int nn = 0;
	        
	        for (int i =0; i <number.length(); i++) {
	        	nn += Integer.parseInt(number.substring(i,i+1));	        	
	        }
	        
	        
	        answer = (x %nn == 0) ? true : false ; 
	        return answer;
	    }
	

	public static void main(String[] args) {
		System.out.println(solution(10));
		

	}


}

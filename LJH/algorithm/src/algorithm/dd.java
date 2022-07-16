package algorithm;

public class dd {
	
	    
	    public static String solution(String n) {	        		
	        return "*".repeat(n.length()-4).concat(n.substring(n.length()-4,n.length()));
	    
	   
	}
	public static void main(String[] args) {
		System.out.println(solution("01045378770"));
	}

}

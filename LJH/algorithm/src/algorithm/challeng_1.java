package algorithm;
import java.util.ArrayList;
import java.util.Collections;
public class challeng_1 {
	
	 public static int solution(int n) {
	        int answer = 0;
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        if (n == 1) {
	        	return 1;
	        } 
	        while (!(n/3 < 3)) {
	        	arrList.add(0,n%3);
	        	n/=3;
	        	if (n/3 < 3) {
		        	arrList.add(0,n%3);
	        		arrList.add(0,n/3);
	        	}
	        	
	        }
	        
	        Collections.reverse(arrList);
	        System.out.println(arrList);
	        int index = arrList.size()-1;
	        
	        for (int i : arrList) {
	        	answer += i*Math.pow(3, index);
	        	--index;
	        }  
	        return answer;
	
	 }
	public static void main(String[] args) {
		
		System.out.println(solution(1));
		

	}

}

package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class qqwe {
	public static int[] solution(int[] arr, int divisor) {
		 	ArrayList<Integer> arrList = new ArrayList<Integer>();
		 
	        for (int i : arr) {
	        	if (i%divisor ==0) {
	        		arrList.add(i);
	        	}
	        }
	        
	        int[] answer = new int[arrList.size()];
	        
	        Collections.sort(arrList);
		    
	        for (int i = 0 ; i < arrList.size() ; i++) {
		    	answer[i] = arrList.get(i).intValue();
		    }

	        int [] error = {-1};

	        return (answer.length==0) ?  answer : error ;
    }

	public static void main(String[] args) {
		int[] answer = {3,2,6};
		solution(answer,10);
		 
	}

}

package algorithm;

import java.util.Scanner;

public class asd {
	public static long solution(int price, int money, int count) {
        
        long answer = -1;
        long m = (long)count*(2*price+(count-1)*price)/2;
        
        if (m > money) {
            answer = m-money;
        }
        
        else {
            answer = 0;
        }
    
        return answer = (m > money) ? m-money : 0;
    }
	


	 public static void main(String[] args) {
		 	
	        
	        	
	       
	       
	        
	    }

}

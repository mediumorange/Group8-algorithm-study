package algorithm;
import java.util.ArrayList;
import java.util.Collections;
public class challeng_1 {
	
	 public static int solution(int n) {
	        String a = "";
	        while (n > 0) {
	        	a = (n%3) + a;
	        	n /= 3;
	        }
	        a = new StringBuffer(a).reverse().toString();       
	        
	        return Integer.parseInt(a,3);
	
	 }
	public static void main(String[] args) {
		System.out.println(solution(25));
		

	}

}

package algorithm;

import java.util.Scanner;

public class problem4 {
	
	
	public static long function(int a, int b) {
		
		long answer = 0;
		
		long min = (long)Math.min(a,b);
		long max = (long)Math.max(a,b);
		
		long n = Math.abs(min-max)+ 1;
		
		answer = n*(2*min + (n-1))/2;
		
		
		return answer;
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //Scanner의 객체생성
        int n = sc.nextInt(); // 1. n을 입력 받기
        int m = sc.nextInt();


        for (int i = 1; i <= m; i++) { // 2. 1부터 i를 1씩 증가하며 반복하기
            for (int j = 1; j <= n; j++) { // 3.  i의 갯수 만큼
                System.out.print("*"); //         별 출력하기
            }
            if (i != m) { // 5. m이라면 줄바꾸지 않기
                System.out.println(); // 4. 줄바꾸기
            }
        }
	
	}

}

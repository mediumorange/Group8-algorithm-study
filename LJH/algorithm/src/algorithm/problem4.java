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
		Scanner sc = new Scanner(System.in);  //Scanner�� ��ü����
        int n = sc.nextInt(); // 1. n�� �Է� �ޱ�
        int m = sc.nextInt();


        for (int i = 1; i <= m; i++) { // 2. 1���� i�� 1�� �����ϸ� �ݺ��ϱ�
            for (int j = 1; j <= n; j++) { // 3.  i�� ���� ��ŭ
                System.out.print("*"); //         �� ����ϱ�
            }
            if (i != m) { // 5. m�̶�� �ٹٲ��� �ʱ�
                System.out.println(); // 4. �ٹٲٱ�
            }
        }
	
	}

}

package algorithm;

public class 콜라츠추측 {
	
	private static int solution (int x) {
		
		int answer = 0;
		long xx = (long) x;
		
		while (xx != 1) {			
			if (xx %2 == 0) {
				xx /= 2;
				++answer;
			}
			
			else {
				xx = 3*x + 1 ;
				++answer;
			}
						
			if (answer == 500) {
				answer = -1 ;
				break;
			}
			
		}
		
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution(626331));

		
		
	}

}

package algorithm;


public class 제일작은수제거하기 {
	
	private static int[] solution(int[] arr) {
		int[] answer = {};
		int min = arr[0];	
		
		for (int i = 0; i < (arr.length)-1; i++) {			
			if (arr[i] > arr[i+1] ) {
				min = arr[i+1];
			}
			
			
            
        }
		System.out.println("min="+ min);

		return answer;
	}

	public static void main(String[] args) {
		
		int[] grade2 = new int[]{70,80,90};
		System.out.println(solution(grade2));
		
		

	}

}

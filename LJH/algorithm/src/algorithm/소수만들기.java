package algorithm;

import java.util.*;

public class 소수만들기 {
	public static int[] solution(int[] answers) {
		int[] answer = {};
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < answers.length - 3; i++) {
			for (int k = 1; k < answers.length - 1; k++) {
				for (int j = 2; j < answers.length; j++) {
					int n = answers[i] + answers[k] + answers[j];
					set.add(n);
					//System.out.println(n);
				}
			}
		}
		
		System.out.println(set);
		return answer;
	}

	public static void main(String[] args) {
		int[] aa = {1,2,3};
		solution(aa);
		// TODO Auto-generated method stub

	}

}

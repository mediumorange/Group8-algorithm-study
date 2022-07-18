package algorithm;

import java.util.*;

public class 소수만들기 {
	public static int[] solution(int[] answers) {
		int[] answer = {};
		int num = 0;
		ArrayList<Integer> set = new ArrayList<Integer>();

		for (int i = 0; i < answers.length - 2; i++) {
			for (int k = 1; k < answers.length - 1; k++) {
				for (int j = 0; j < answers.length; j++) {
					if(k==j || i==j || i==k) {
						continue;
					}
					System.out.println("i= " + i + " k= " + k + " j= " +j);
					int n = answers[i] + answers[k] + answers[j];
					set.add(n);
					//System.out.println(n);
				}
			}
		}
		System.out.println(set);
		String prime = "";
		for(int i : set) {
			if(prime == "prime") {
				++num;
			}
			for(int k = 2; k < i; k++ ) {
				if (i % k == 0) {
					prime = "notprime";
					break;
				}
				else {
					prime = "prime";
				}
			}
		}
		System.out.println(num);
		return answer;
	}

	public static void main(String[] args) {
		int[] aa = {1,2,7,6,4,5};
		solution(aa);
		// TODO Auto-generated method stub

	}

}

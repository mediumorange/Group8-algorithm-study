package algorithm;

import java.util.*;

public class challenge_32 {
	public static int[] solution(int[] numbers) {
		int[] answer = {};
		HashSet<Integer> set = new HashSet<Integer>();  //hash�Լ� ����
		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = 1; j < numbers.length; j++) {
				if (j == i) {
					continue;
				} else {
					set.add(numbers[i] + numbers[j]);
				}
			}
		}
		ArrayList<Integer> al = new ArrayList<>(set);
		Collections.sort(al); //����
		answer = al.stream().mapToInt(Integer::intValue).toArray();  // arraylist�� �迭�� ��ȯ
		return answer;
	}

	public static void main(String[] args) {
		int[] answer = { 0, 0 };
		System.out.println(solution(answer));
	}

}

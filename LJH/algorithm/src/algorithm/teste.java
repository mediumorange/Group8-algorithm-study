package algorithm;

import java.util.ArrayList;

public class teste {
    public static int[] solution(int[] arr) {
        int[] answer = new int [arr.length-1];
        int[] wrong_answer = {-1};
        int min = arr[0];
        int find_index = 0;

        ArrayList<Integer> integerarr = new ArrayList<>(arr.length);

        for (int i : arr) {
            integerarr.add(i);
        }

        for (int i = 0; i < arr.length -1; i++) {
            if (min > arr[i+1]) {
                min = arr[i+1];
                find_index = i+1;
            }
        }

        integerarr.remove(find_index);

        for (int i = 0; i < answer.length ; i++) {
            answer[i] = integerarr.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }


        return (answer.length > 1) ? answer : wrong_answer;
    }

    public static void main(String[] args) {
        int [] arr = {4};
        System.out.println(solution(arr));

    }
}

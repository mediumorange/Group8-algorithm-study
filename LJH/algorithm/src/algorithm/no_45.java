package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class no_45 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> arr = Arrays
                .stream(array)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> arr1 ;
        int i = 0;
        for (int[] a : commands) {
            if (a[0] == a[1]) {
                answer[i] = arr.get(a[0] - 1);
                ++i;
            } else {
                arr1 = arr.subList(a[0] - 1, a[1]);
                Collections.sort(arr1);
                answer[i] = arr1.get(a[2] - 1);
                ++i;
                System.out.println("arr= " + arr);
                arr = Arrays.stream(array).boxed().collect(Collectors.toList());
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        no_45 so = new no_45();
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        System.out.println(so.solution(a, b));
    }
}

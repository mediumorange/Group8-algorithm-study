package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class no_43 {

        public int solution(int[] d, int budget) {
            int answer = 0;
            List<Integer> arr = Arrays.stream(d)
                    .boxed()
                    .collect(Collectors.toList());
            Collections.sort(arr);


            for (int i : arr) {
                budget -= i;
                if(budget<0) break;
                ++answer;

            }


            System.out.println(arr);
            return answer;
        }


    public static void main(String[] args) {
        no_43 so = new no_43();
        int [] d = {2,2,3,3};
        System.out.println(so.solution(d,10));
    }
}

package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class no_48 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Integer> newstage = Arrays.stream(stages)
                                      .boxed()
                                      .collect(Collectors.toList());
        Collections.sort(newstage);
        System.out.println(newstage);
        Map<Integer, Double> map = new HashMap<>();

        double temp = 0;
        double temp2 = 0;
        for (int i = 1; i <= N; i++) {
            temp2 += Collections.frequency(newstage, i - 1);
            temp =  (double) Collections.frequency(newstage,i) / (stages.length -temp2);
            if (Double.isNaN(temp) ){
                map.put(i, (double) 0);
            }
            else {
                map.put(i,temp);
            }
        }

        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        int i = 0;
        for(Integer key : listKeySet) {
            answer[i] = key;
            i++;
        }
        return answer;

    }

    public static void main(String[] args) {
        no_48 so = new no_48();
        int[] n = {1,3,4,5,3,2,2,2};
        System.out.println(so.solution(5, n));



    }
}

package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class no_49 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        List<Integer> res = Arrays.stream(reserve)
                            .boxed()
                            .collect(Collectors.toList());
        List<Integer> los = Arrays.stream(lost)
                            .boxed()
                            .collect(Collectors.toList());

        Collections.sort(res);
        Collections.sort(los);
        int [] lost_ = los.stream().mapToInt(i -> i).toArray();

        for (int i  : lost_ ) {                            //잃어버린사람과 여분있는 사람이 같을때 list에서 제거
            if (res.contains(i)) {
                res.remove(Integer.valueOf(i));
                los.remove(Integer.valueOf(i));
            }
        }

        if (res.size() == 0) {
            return (n-los.size());
        }

        for(int i : los) {
            if (los.size() != 0) {            //잃어버린 사람이 아무도 없을때
                if(res.contains(i-1)) {
                    res.remove(Integer.valueOf(i-1));  //앞에사람 빌려주기
                }
                else if(res.contains(i+1)) {
                    res.remove(Integer.valueOf(i+1)); //뒤에사람 빌려주기
                }
                else {                  //인접한 사람이 없을때는 전체학생수 -1
                    --answer;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        no_49 so = new no_49();
        int [] lost = {1,2,3,4};
        int [] res = {1,2,3,4};
        System.out.println(so.solution(4,lost,res));
    }

}



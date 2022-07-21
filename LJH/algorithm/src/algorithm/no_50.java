package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class no_50 {
    public int solution(int[] nums) {
        int getpoketmon = nums.length / 2;

        Set<Integer> poketkind = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            poketkind.add(nums[i]);
        }


        if(poketkind.size() > getpoketmon) {
            return getpoketmon;
        }


        return poketkind.size();
    }

    public static void main(String[] args) {
        no_50 so = new no_50();
        int[] nums = {3,3,3,2,2,2};
        System.out.println(so.solution(nums));

    }
}

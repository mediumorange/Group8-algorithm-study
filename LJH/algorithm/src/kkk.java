import java.util.ArrayList;
import java.util.Arrays;

public class kkk {


    public class Solution {

        public static int[] solution(int[] arr) {
            int[] answer = new int[arr.length - 1];
            if (arr.length == 1) {
                answer = new int[]{-1};
            }
            else {

                int b = arr[0];
                int j = 0;
                for (int a : arr) {
                    if (a > b) {
                        answer[j] = a;
                        j++;
                    } else if (a < b) {
                        answer[j] = b;
                        b = a;
                        j++;
                    }
                }
            }
            return answer;
        }

        //    확인용
        public static void main(String[] args) {

            int[] arr = {3};
            System.out.println(Arrays.toString(solution(arr))); //
        }
    }
}

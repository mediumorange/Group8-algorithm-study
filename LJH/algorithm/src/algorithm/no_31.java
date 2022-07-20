package algorithm;
import java.util.*;

public class no_31 {
    public int[] solution(int []arr) {
        Stack <Integer> ans = new Stack<>();
        ans.push(arr[0]);

        for (int i : arr) {
            if (ans.peek() != i) {
                ans.push(i);
            }
        }

        int[] answer = new int[ans.size()];
        System.out.println(ans);
        for (int i = ans.size()-1; i >= 0;i--) {
            answer[i] = ans.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        no_31 so = new no_31();
        int[] a = {1,1,3,3,0,1,1};
        System.out.println(so.solution(a));
    }
}

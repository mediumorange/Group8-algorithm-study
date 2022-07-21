package algorithm;

import java.util.Arrays;

public class no_47 {
    public int solution(int n) {
       int answer = 0;
       int[] arr = new int[n+1];
       for (int i =0; i<=n;i++) {
           arr[i] = i;
       }
       arr[1] = 0;

       for (int i = 2; i<=n; i++) {
           if(arr[i]==0)continue;
           for(int j = i+i;j<=n;j+=i) {
               arr[j] = 0;
           }
       }
       for (int i = 0; i<arr.length; i++) {
           if(arr[i] !=0) {
               ++answer;
           }
       }

        System.out.println(Arrays.toString(arr));

       return answer-1;
    }

    public static void main(String[] args) {
        no_47 so = new no_47();
        System.out.println(so.solution(11));

        System.out.println((int)Math.sqrt(7));

    }
}

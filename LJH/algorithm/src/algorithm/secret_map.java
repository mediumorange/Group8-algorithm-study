package algorithm;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class secret_map {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i< n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (String i : result) {
            System.out.println(i);
        }


        for (int i = 0;i < n;i++) {
            result[i] = String.format("%"+n+"s", result[i]);
            result[i] = result[i].replace("1","#");
            result[i] = result[i].replace("0"," ");
        }

        for (String i : result) {
            System.out.println(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {9, 20, 28, 18, 11};
        int[] b = {30, 1, 21, 17, 28};
        String vc ="33333";
//        String asd = "10111";
//        asd = asd.replace("1","#").replace("0"," ");
//        System.out.println(asd);
        solution(5, a, b);

    }
}

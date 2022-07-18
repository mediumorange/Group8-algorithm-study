import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class secret_map {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        answer[0] = "3";
        int[] map1 = {9, 20, 28, 18, 11};
        int[] map2 = {30, 1, 21, 17, 28};
        String[] binary_map1 = new String[n];
        String[] binary_map2 = new String[n];

        for (int i = 0; i < map1.length; i++) {
            binary_map1[i] = String.format("%0" + n + "d", parseLong(Long.toBinaryString(map1[i])));
        }

        for (int i = 0; i < map2.length; i++) {
            binary_map2[i] = String.format("%0" + n + "d", parseLong(Integer.toBinaryString(map2[i])));
        }


        for (int i = 0; i < n; i++) {
            String aa = "";
            answer[i] = aa;
            for (int j = 0; j < n; j++) {
                long a = parseLong(binary_map1[i].substring(j, j + 1)) | parseLong(binary_map2[i].substring(j, j + 1));
                System.out.print(a+" ");
                if (a == 1) {
                   answer[i] += "#";
                } else {
                    answer[i] +=" ";
                }
            }
        }

        System.out.println("");

        for (String i : answer) {
            System.out.println(i);
        }


        return answer;
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

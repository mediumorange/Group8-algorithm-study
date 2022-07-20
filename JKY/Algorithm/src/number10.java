import java.util.Arrays;

class number10 {
    public int[][] number10(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i =0; i< arr1.length; i++) {
            for (int j =0; j< arr1[0].length; j++) {
                int a1 = arr1[i][j] + arr2[i][j];
                answer[i][j] = a1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        number10 sol = new number10();
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        int[][] a = sol.number10(arr1,arr2);
        System.out.println(Arrays.deepToString(a));
    }
}
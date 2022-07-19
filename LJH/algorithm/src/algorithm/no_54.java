package algorithm;

import java.util.Stack;

public class no_54 {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer>[] arr = new Stack[board.length];
        Stack<Integer> ad = new Stack<>();

        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            arr[i] = new Stack<Integer>();
        }

        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 0) {
                    arr[j].push(board[i][j]);
                }
            }
        }

        int cnt = 0;

        for (int i : moves) {
            if (!arr[i - 1].empty()) {
                int dol = arr[i - 1].pop();
                if(ad.empty()) {  //바구니 비었을때
                    ad.push(dol);
                } else if (dol == ad.peek())
                    {
                    ad.pop();
                    answer += 2;
                }
                else {
                    ad.push(dol);
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(a, move));
    }

}

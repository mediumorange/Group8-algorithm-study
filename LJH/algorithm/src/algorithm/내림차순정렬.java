package algorithm;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;


public class ������������ {
	public static long solution(long n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<String> arrList2 = new ArrayList<String>();
        String sanswer = "";
        String to = Long.toString(n);

        for (int i = 0;  i<to.length(); i++) {
            arrList.add(to.charAt(i) -'0');  // �ƽ�Ű�ڵ� '1'=49 '0'=48 => '1' -'0' = 1

        }

        Collections.sort(arrList, Collections.reverseOrder()); //�������� ����

        for(int i = 0; i < arrList.size(); i++) {
            sanswer += arrList.get(i);
        }



        n = Long.parseLong(sanswer); // �ٽ� Long ���·� ��ȯ


        return n;

        
    }
	
	
	
	
	public static void main(String[] args) {
        int [] a = {1,2,3};
        String avc = "";
        for (int i : a) {
            avc += i;
        }
        int n = 4;
	}

}

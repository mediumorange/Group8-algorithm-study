package algorithm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


 // array ["a","b","c"]   O(n)
 // Hashset {"a" : value, "b" : value, "c": value}  O(1)

public class ���� {
	
	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		HashMap<String, Integer> par = new HashMap<>();
        int target = 1;
		
        for (int i =0;i<participant.length; i++) {
        	String name = participant[i];
        	if (!par.containsKey(name)) {
        		par.put(participant[i],1);  // �⺻������ �����ڵ��� value�� 1�� ����
        	}     		
        	else {
        		target = par.get(name);
        		par.put(name,++target);  // ���� �ߺ��� �����ڰ� ������ ++target���� ����
        	}
        	
        }

        System.out.println(par);

        for (int i = 0; i<completion.length;i++) {
        	
        	String name = completion[i];
        	target = par.get(name);
        	if (target == 1) {
        		par.remove(name);      //�����ڿ� �����ڰ� ���Եƴٸ� �����ֱ�
        	}
        	else {
        		par.put(name,--target);  // target�� 1�� �ƴϸ� �ߺ��� �������̹Ƿ� value���� 1������
        	}    	
        }

		System.out.println(par);
        Set<String>keys = par.keySet();
        String key = keys.toString();
        answer = key.substring(1,key.length()-1);
        
        return answer;

        
    }

	public static void main(String[] args) {
		
        String[] par = {"a","a","b","c"};
        String[] com = {"a","a","c"};
		System.out.println(solution(par,com));
	}

}

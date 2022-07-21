package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

	public static void main(String[] args) {

		List <Integer> aa = new ArrayList<>();
		List <Integer> bb;
		aa.add(7);
		aa.add(3);
		aa.add(1);
		aa.add(2);
		aa.add(5);
		System.out.println(aa);

		bb = aa.subList(1,4);
		Collections.sort(bb);
		System.out.println(bb);

	}

}

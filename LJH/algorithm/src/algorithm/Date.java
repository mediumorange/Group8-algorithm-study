package algorithm;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		time.set(2016,4,24);
		System.out.println(time.getTime().toString().substring(0,3).toUpperCase());
	}

}

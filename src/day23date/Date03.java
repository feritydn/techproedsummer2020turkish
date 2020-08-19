package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipulation
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.plusHours(5));
		System.out.println(time.plusMinutes(15));
		System.out.println(time.plusSeconds(30));
		
		
		System.out.println(time.minusHours(3));
		System.out.println(time.minusMinutes(15));
		System.out.println(time.minusSeconds(45));

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		
	}

}

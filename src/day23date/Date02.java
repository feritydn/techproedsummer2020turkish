package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation : Date uzerinde degisiklikler yapmak.
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(1));
		System.out.println(date.plusDays(13));
		System.out.println(date.plusDays(300));
		System.out.println(date.plusDays(1300));
		System.out.println(date.plusDays(-1)); // ==> bu cok kullanilmaz bunun icin baska nethod var.
		
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusMonths(1000));
		
		System.out.println(date.plusYears(5));
		System.out.println(date.plusWeeks(2));
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(3));
		System.out.println(date.minusMonths(3));
		System.out.println(date.minusYears(3));
		
		
		
		
		

	}

}

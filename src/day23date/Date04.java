package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//20-May-2020
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yyyy");
		System.out.println(dtf1.format(date.plusMonths(7))); // calisir ama biz cift M koyalim.
	
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(dtf2.format(date));
		
		// time formatini degistirmek
		
		LocalTime time1 = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(dtf3.format(time1));
	
		// HH kullanirsak 24 luk saat dilimini kullanir.
		
		
		
		// Baska ulkenin Local zamanin almak.
		
		System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));
		System.out.println(LocalTime.now(ZoneId.of("America/New_York")));
		
	}

}

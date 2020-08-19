package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] listini olusturunuz
		
		List <String> list01 = new ArrayList<>();
		
		list01.add("A");
		list01.add("C");
		list01.add("B");
		list01.add("C");
		
		System.out.println(list01);
		
		// listte eleman olarak B var mi?
		System.out.println(list01.contains("B"));
		//Eger B eleman oalrak varsa True yoksa False return eder
		System.out.println(list01.contains("Z"));
	
	
		// Listtedki elemanlari alfabetik sraya koyunuz
		// Collection ==> Bir araya getirilmis parcalar demek.
		Collections.sort(list01); // (Natural order)
		System.out.println(list01);
		
		

	}

}

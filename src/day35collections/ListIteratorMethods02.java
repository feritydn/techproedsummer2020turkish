package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanalri A B ve C olan bir lsit olusturunuz ve list iterator kullanarak
		// bu elemanlari AW, BW, ve CW ye donusturunuz.

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); // [A, B, C]
		

		ListIterator <String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
		Object element =	listIterator.next();
		listIterator.set(element + "W");
		
		}
		System.out.println(list);
		
		listIterator.add("kemal");
		listIterator.add("Can");
		System.out.println(list);
		
	}

}

package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// Linked list objesi olusturunuz.
		
		// Link list'de head haric her eleman icin bir data ve bir de pointer var
		// head de sadece pointer var. Her elemanini pointeri bir sonraki elemani gosterir.
		// son elemananin (tail) pointeri null gosterir. 
		// Data ve pointer iceren her elemanin diger adi 'node' dir.
		// Linked list eleman ekleme ve cikarma durumlarinda basarilidir.
		LinkedList <String> linkList1 = new LinkedList<>();
		linkList1.add("Mark");
		linkList1.add("Amanda");
		linkList1.add("Jhon");
		linkList1.add("Ann");
		linkList1.add("Pamela");
		
		System.out.println(linkList1); // [Mark, Amanda, Jhon, Ann, Pamela]
		linkList1.remove(2); // remove() methodu indexe gore eleman siler.
		System.out.println(linkList1); // [Mark, Amanda, Ann, Pamela]
		linkList1.removeFirst();
		System.out.println(linkList1);
		linkList1.removeLast();
		System.out.println(linkList1);
		linkList1.add(1, "Ali");
		System.out.println(linkList1);
		linkList1.addFirst("Kemal");
		System.out.println(linkList1);
		linkList1.addLast("Zeynep");
		System.out.println(linkList1);
		linkList1.set(1, "Ajanda");
		System.out.println(linkList1);
		
		LinkedList <String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		linkList1.addAll(linkList2);
		System.out.println(linkList1);
		linkList2.addAll(linkList1);
		linkList1.addAll(3,linkList2);
		System.out.println(linkList1);
		
		System.out.println(linkList2.contains("Can"));
		System.out.println(linkList2.contains("Ali"));
		
		linkList2.clear();
		System.out.println(linkList2);
		System.out.println(linkList2.isEmpty());
		
	}

}

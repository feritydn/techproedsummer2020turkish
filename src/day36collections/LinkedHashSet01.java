package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// LinkedHashSet: 	1) Dublication a izin vermez, key value yapisi var.
		//					2) Elemealari programcini girdigi siraya gore dizer.
		//					3) Ilk girdigimizi ilk ikinci yaptigimizi ikinci yapar.
		
		LinkedHashSet <String> lhSet = new  LinkedHashSet <>();
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");
		System.out.println(lhSet); // [Z,A,D,B]
		
		LinkedHashSet <Integer> lhSet1 = new  LinkedHashSet <>();
		lhSet1.add(3);
		lhSet1.add(1);
		lhSet1.add(5);
		lhSet1.add(0);
		System.out.println(lhSet1); // [Z,A,D,B]
		
		TreeSet <Integer> tSet = new TreeSet<>(lhSet1);
		System.out.println(tSet);
	}

}

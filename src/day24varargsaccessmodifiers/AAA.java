package day24varargsaccessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(5);
		list.set(1, 6);
		list.remove(0);
		
		System.out.println(list);
	}

}

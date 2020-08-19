package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		int arr[] = {12,21,13,43};

		// for loop kullannarak elemanlari ekrana yazdir.
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("====");
		
		// for each loop kullanarak elemanlari ekrana yazdir
		
		for (int w: arr) {
			System.out.println(w);
		}
		System.out.println("===");
		
		// String iceren bir array olusturun  elemanlarinin yan yana 
		// aralarina bosluk koyarak for each ile yazdirin
		
		String arr1 [] = {"Ali", "Can", "Canan"};
		
		for (String w: arr1) {
			System.out.print(" " + w);
		}
	
		// int elemnalar iceren bir list olusturunn ve for each loop kullanarak
		// bu elemanlarin toplamini ekrana yazdirin.
		System.out.println();
		List <Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		int sum = 0;
		System.out.println(list);
		
		for (int w:list) {
			sum = sum+w;
		}
		
		System.out.println(sum);
		
		// {{1,2},{5},{6,7,8}} arrayindaki tum elemanlarin toplamini bulunuz
		
		int arr2 [][] =  {{1,2},{5},{6,7,8}};
		int sum1 = 0;
		for (int [] w: arr2) {
			for (int f: w) {
				sum1 = sum1 + f;
				
			}
			
		}
		
		System.out.println(sum1);
	}

}

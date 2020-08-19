package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// kullanicinin girdigi dort basamakli  sayisinin ilk ve son 
		//rakaminin toplamini veren program yaziniz.
		
	   Scanner scan = new Scanner(System.in);
	   System.out.println("lutfen dort basamakli bir tamsayi yaziniz");
	   int s = scan.nextInt();
	   
	   // bir tamsayini birler basamagini bulmak icin ona boleriz. modulus 10
	   
	   int sonRakam = s%10;
	   // ilk basamagi bulmak icin de 1000 bolmek lazim
	   int ilkRakam = s/1000;
	   
	   System.out.println(sonRakam+ilkRakam );
	   
		scan.close();

	}

}

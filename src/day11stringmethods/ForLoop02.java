package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		
		// 100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran 
		// for loop olusturunuz.
		
		for (int i = 3; i<100; i = i+3) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		// Ilk 5 sayma sayisinin toplamini veren progremi for loop ile yaziniz
		// 1+2 =3, 3+3=6 , 6+4 = 10, 10+5 =15
		// int sum kullanacagiz mutlaka
		// int sum =0; kullanacagiz
		
		int sum =0;
		for (int i=1; i<6 ; i++) {
			
			sum = sum +i;
			
		}
		System.out.println("Toplam: " + sum);
		
		// eger sadece sonucu gormek istersek syso kismini 
		// body disina yazariz. Body icine yazarsak her adim icin sonuc verir.
		
		// 10 dan buyuk ilk 3 sayma sayisini  toplamini veren
		// for loop u yaziniz
		
		int sum2 = 0;
		
		for (int i= 11; i<14 ; i++) {
			sum2 = sum2+i;
			
		}
		System.out.println("toplam :" + sum2);
		
		// 0 dan 100 kadarki 5 e bolunen sayilarin toplami
		
		int sum3 = 0;
		
		for (int i =5 ; i<100; i = i +5) {
			sum3 = sum3+i;
			
		}
		System.out.println(sum3);
		
		// 20 den buyuk ilk bes sayinin toplamini yapan loop yaziniz.
		
		
		int sum4 = 0;
		
		for (int i = 21 ; i<26 ; i++) {
			sum4 = sum4 + i;
			
		}
		System.out.println(sum4);
		
		// ilk 50 sayma sayisinin toplamini verene for loop
		
		int sum5 = 0;
		
		for (int i =1 ; i<51 ; i++) {
			sum5 = sum5 + i;
			
		}
		System.out.println(sum5);
		
		
		
				
		
		
		
		
		
		
	}

}

package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// bolme islemi yapan bir program yazalim.
		
		int num1 = 0;
		int num2 = 0;
		try {
		System.out.println(num1/num2);
		}catch( java.lang.ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilmaz");
		}catch(Exception e) {
			System.out.println("her turlu exception'i yakala");
		}
		//  java.lang.ArithmeticException run time excepiondur. Matematik kuralalrina
		// uygun olmayan bir islem yapildiguinda bu exception alinir.
		
		// try'dan sonra birden fazla catch kullanilabilir. ama ustteki 
		// catch alltaki catchin childi olmali. specific den genele dogru dizmeliyiz
		
	}

}

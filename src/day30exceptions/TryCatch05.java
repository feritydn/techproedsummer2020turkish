package day30exceptions;

public class TryCatch05 {

	public static void main(String[] args) {
		try {
			hop ();
			
		}catch (Exception e) {
			e.printStackTrace();
			// printStackTrace() methodu exceptionun nerede oldugunu
			// detayli bilgisini verir.exceptionu olusum sirasina gore verir
			
		}
	}
	private static void hop() {
		throw new RuntimeException ("cannot hop");
	}

}

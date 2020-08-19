package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		System.out.println(exceptions());

	}
	@SuppressWarnings ("finally")
	public static String exceptions() {
		String result ="";
		String v = null;
		
		try {
			try {
				result += "before";
				v.length();
				result +="after";
			}catch (NullPointerException e) {
				result +="catch";
				throw new RuntimeException();	
			}finally {
				result += "finally";
				throw new Exception();
			}
				
			}catch(Exception e) {
				result += "done";
		}
		return result;
	}

	/* throw ile throws keywordlerin farki
	 * 1) throw method bodysi icine yazilir throws method parantezi ile
	 *    curly bracenin arasina yazilir.
	 * 2) throwu method bodysi icinde exception almak istedigimiz yerde kullanabiliriz.
	 *    throws ise mecburen method isminden sonra sadece bir kere kullanlir.
	 * 3) Bir throw kullanirsaniz sadece bir tane exception throws ile birden cok exception
	 *    uretebilirsiniz. Yani "throws NullPointerException, ArithmeticException"
	 * 4) throw icin syntax == > throw new NullPointerExceptoin
	 *    throws icin syntax ==> ) throws NullPointerException{...           
	 */
	
	
	
	
}

package day30exceptions;

public class TryCatch02 {
	static String m;

	public static void main(String[] args) {
		String s = "";
		System.out.println(s.length());

		try {
			s += "t";
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.println(s);

		// Stringe null atandigi zaman veya intence variabeye deger a
		// atamasi yapilmadiginda lenght methodu calismaz
		// ve NullPointerException alirsiniz.

		// String n = null;

		// System.out.println(n.length());
		// System.out.println(m.length());
	}

}

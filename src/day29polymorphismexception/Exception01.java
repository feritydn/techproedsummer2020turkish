package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception "Istisnayi hata demek"
		// temelde iki tur exception var
		// Bunlar; 1) Compile Time Exception (Checcked)
		//         2) Run Time Exception
		
		// Compile Time Exception;
		//                       1) FileNotFounException
		//                       2) IOException(Input =Output) input veya output yapilirken olusan problemelrde ortaya cikar
		// Not : FileNotFoundException IOException'un child'idir.
		// Not : Compile Time Exceptionlar mutlaka "handle or declared" edilmelidir.
		
		// iki t�rl� yap�yoruz:
		// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
		// 2-)try-catch blocks. try: dene, catch= yakala demketir.
		// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
		//aradaki fark: try catch �nce dener. olmazsa mesaj atar.
		//ama trow da haz�r mesajlar� ekrana atar problem hakk�nda. 
		// ama ayr�nt� ve hatan�n yerini s�zleyen bir mesaj yazabilirz. bu y�zden readable dir.

	}

}

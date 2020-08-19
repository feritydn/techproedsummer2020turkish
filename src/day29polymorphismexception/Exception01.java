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
		
		// iki türlü yapýyoruz:
		// 1*) throws yazmak: javaya: "problem varsa yardým iste demektir."
		// 2-)try-catch blocks. try: dene, catch= yakala demketir.
		// 3-) dene- hata cýkarsa -yakala-yapamazsan-bana mesaj at. readable dýr.
		//aradaki fark: try catch önce dener. olmazsa mesaj atar.
		//ama trow da hazýr mesajlarý ekrana atar problem hakkýnda. 
		// ama ayrýntý ve hatanýn yerini sözleyen bir mesaj yazabilirz. bu yüzden readable dir.

	}

}

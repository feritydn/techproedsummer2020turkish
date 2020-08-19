package day29polymorphismexception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
	// Checked exception(Compile Time Exception) handle etmek icin iki yol var
	// Birinicisi "Throws" keywordunu kullanmak. Bunu kullanirsaniz teknk mesajlar gororsunuz.
	// Bu yuzden cok tercih edilmez.
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		file.equals(file);
	}

}
// Ikincisi "Try-catch block" kullanmaktir. Bunu kulanirsaniz console de teknik
// mesajlar yerine kendi yazdiginiz mesajlari gorebilirsiniz. Bu yuzden tercih
// edilir. 
class ExceptionTryCatch{
	public static void main(String[]args) {
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
			file.equals(file);
		} catch (FileNotFoundException e) {
			System.out.println("Dosyanin path i yanlis yada dosya silinmis olabilir");
		}
	}
}

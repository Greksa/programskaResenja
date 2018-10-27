package programskaResenja;
import java.util.Scanner;
public class BrojUnazad {

	public static void main(String[] args) {
    Scanner tastatura = new Scanner (System.in);
    System.out.println("Program obrce uneti celi trocifreni broj: primer 932 ce biti 239");
    System.out.println("Unesite vas trocifreni broj");
	int x = tastatura.nextInt();	
	int zadnjiBroj = x % 10;
	int dva = x / 10;
	int drugiBroj = dva % 10;
	int prviBroj = dva / 10;
	System.out.printf("Obrnuti broj je: " + zadnjiBroj + drugiBroj + prviBroj );

	}

}

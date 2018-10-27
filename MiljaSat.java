package programskaResenja;
import java.util.Scanner;
public class MiljaSat {

	public static void main(String[] args) {
		Scanner tastatura = new Scanner (System.in);
		float razdaljina = 10000;
		float brzinaMilje;
		float sati;
		float vremeUsekundama;
		float brzinaKilometri;
		System.out.println("Program racuna brzinu mph ako znamo da je razdaljina 10000 metara");
		System.out.println("Unesite utroseno vreme u satima: ");
		sati = tastatura.nextFloat();
		vremeUsekundama = sati * 3600;
		brzinaKilometri = (razdaljina / 1000.0f) / (vremeUsekundama / 3600.0f);
		brzinaMilje = brzinaKilometri / 1.609f;
		System.out.println("Vasa brzina u km/h je: " + brzinaKilometri);
		System.out.println("Vasa brzina u mp/h je: " + brzinaMilje);
		

	}

}

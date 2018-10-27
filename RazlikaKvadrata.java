package programskaResenja;

//** PROGRAM RACUNA OPSOLUTNU VREDNOST RAZLIKE KVADRATA, A ZATIM REZULTAT (CIFRU) KONVERTUJE U SLOVA PO ENGLESKOM ALFABETNOM REDOSLEDU */
import java.util.Scanner;

public class RazlikaKvadrata {

	public static void main(String[] args) {
		int x, y, z;
		Scanner tastatura = new Scanner(System.in);
		NaAlfabet NaAlfabetObject = new NaAlfabet(); // Putanja (objekat) ka metodu koji radi modul 26!

		System.out.println(
				"Program racuna razliku kvadrata dva uneta broja. Zatim ispisuje slova na engleskom alfabetu koji odgovara dobijenom modulu (0 – ‘a’, 1 – ‘b’, itd).! ");

		System.out.println("Unesite vas prvi broj: ");
		x = tastatura.nextInt(); // unosenje prvog broja putem Scanner-a!
		System.out.println("Unesite vas drugi broj: ");
		y = tastatura.nextInt(); // unosenje drugog broja putem Scanner-a!

		z = (x + y) * (x - y); // formula za izracunavanje razlike kvadrata!
		z = Math.abs(z); // apsolutna vrednost krajnjeg rezultata!

		NaAlfabet.getCharForNumber(z); // finalna cifra se salje u metod getCharForNumber!
		System.out.println("Rezultat je: " + z); // Stampamo rezultat kao cifru!
		System.out.print("Njegova vrednost u alfabetu je: ");
		System.out.println(NaAlfabet.getCharForNumber(z)); // Stampamo rezultat kao slova!

	}

}

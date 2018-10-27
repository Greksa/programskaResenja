package programskaResenja;
import java.util.Scanner;
// Ovaj Java program broji koliko se puta slovo 'b' javlja posle slova 'z'
// u nekoj reci (Stringu)!

public class BrojiSlovo {

	public static void main(String[] args) {

		char ch = 'b';
		int brojac = 0;
		System.out.println("Program broji koliko se puta slovo 'b' javlja \n " + "posle slova 'z' u nekoj reci!");
		System.out.println();

		Scanner tastatura = new Scanner(System.in);
		// Korisnik preko Scannera unosi zeljenu rec.
		System.out.println("Unesite vasu rec koja sadrzi slova 'b' i 'z'.\n"
				+ "Na primer: zaobici, zabraniti, Kazablanka. slovo 'z' mora biti malo slovo!");
		System.out.println();
		String str = tastatura.nextLine();
		// vraca index od karaktera 'z'
		int pocetak = str.indexOf('z');
		System.out.println();
		// stampamo poziciju slova 'z' ma gde ona bila u nekom stringu.
		System.out.println("Pocinjemo brojanje od slova 'z'" + " koje je na poziciji : " + pocetak);
		// pomocu for petlje brojimo slova 'b' pocevsi od 'z'.
		for (int i = pocetak; i < str.length(); i++) {
			// pomocu brojaca dodajemo 'b' zbiru svaki put kada na njega naidjemo.
			if (ch == str.charAt(i)) {
				++brojac;
			}

		}
		// Stampamo krajnji rezultat.
		System.out.println("Slovo " + ch + " se nalazi posle slova 'z' tacno: " + brojac + " puta.");
	}

}


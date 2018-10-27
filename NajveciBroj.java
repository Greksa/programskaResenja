package programskaResenja;

import java.util.Scanner;
// Program trazi i ispisuje najvecu cifru nekog veceg broja

public class NajveciBroj {

	public static void main(String args[]) {
		Scanner tastatura = new Scanner(System.in);
		int tbroj;
		int nbroj = 0;
		System.out.println("Unesite jedan trocifreni broj: ");
		tbroj = tastatura.nextInt();

		if (tbroj >= 100 && tbroj <= 999) {
			System.out.println("Uneli ste broj: " + tbroj);
		} else {
			System.out.println("Niste uneli trocifren broj");

		}

		while (tbroj > 0) {
			if (tbroj % 10 > nbroj) {
				nbroj = tbroj % 10;
			}
			tbroj = tbroj / 10;
		}
		System.out.println("Najveca cifra ovog broja je:- " + nbroj);
	}
}

package programskaResenja;
//Program trazi od korisnika da unese duzinu niza i elemente niza.

// Zatim stampa svaki treci (3) element tog niza.

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		// elemente cemo predstaviti kao cele brojeve.
		// pri unosu duzine i broja elemenata koristite samo cele brojeve.
		int x;
		int[] y;

		Scanner tastatura = new Scanner(System.in);
		System.out.println("Program stampa svaki treci element niza!");
		System.out.println("Unesite željenu dužinu niza:");

		x = tastatura.nextInt();
		y = new int[x];
		System.out.println("Unesite elemente / cele brojeve vašeg niza:");
		// pomocu for petlje ispunjavamo niz elementima
		for (int i = 0; i < x; i++) {
			y[i] = tastatura.nextInt();
		}

		System.out.println("\nElementi niza su : ");
		// pomocu druge for petlje stampamo svaki treci element
		for (int i = 2; i < y.length; i += 3) {
			System.out.println(y[i]);
			tastatura.close();
		}
	}
}

package programskaResenja;

import java.util.Scanner;

//PROGRAM IZRACUNAVA FAKTORIJAL BROJA n 
public class FaktorijalBroja {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int x, y, faktorijal = 1;
		System.out.println("Program izracunava faktorijal broja n...");
		System.out.println("Unesite jedan ceo broj: ");
		x = ulaz.nextInt();
		if (x < 0) {
			System.out.println("Broj ne bi trebao da bude negativan broj, pokusajte ponovo! ");
		} else {
			for (y = 1; y <= x; y++) {
				faktorijal = faktorijal * y;
			}

			System.out.println("Faktorijal od broja " + x + " je = " + faktorijal);

		}
	}

}

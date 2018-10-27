package programskaResenja;

import java.util.Scanner;
// program izracunava obim i povrsinu kvadrata

public class ObimIpovrsinaKvadrata {

	public static void main(String[] args) {
		
		Scanner tastatura = new Scanner(System.in);
		int stranica, obim, povrsina;
		System.out.println("Program izracunava obim i povrsinu kvadrata!");
		System.out.println("Unesite duzinu stranice kvadrata...");
		stranica = tastatura.nextInt();
		obim = stranica * 4;
		povrsina = stranica * stranica;

		System.out.println("Povrsina kvadrata je: " + povrsina + "\nObim kvadrata je: " + obim);

	}

}

package programskaResenja;

import java.util.Scanner;

// Program izracunava povrsinu i obim kvadrata
// Stampa vreme u sekundama za izvrsenje programa
public class Pkvadrata {

	public static void main(String[] args) {
		long po�etnoVreme;
		long zavr�noVreme;
		double protekloVreme;

		po�etnoVreme = System.currentTimeMillis();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite veli�inu stranice kvadrata: ");
		int stranica = ulaz.nextInt();
		int obim = stranica * 4;
		int povrsina = stranica * stranica;

		System.out.println("Obim kvadrata je: " + obim + "\nPovr�ina kvadrata je: " + povrsina);
		zavr�noVreme = System.currentTimeMillis();
		protekloVreme = (zavr�noVreme - po�etnoVreme) / 1000.0;
		System.out.println();
		System.out.print("Vreme izvr�avanja u sekundama je: ");
		System.out.println(protekloVreme);
		
	}

}

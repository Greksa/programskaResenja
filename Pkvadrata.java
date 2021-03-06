package programskaResenja;

import java.util.Scanner;

// Program izracunava povrsinu i obim kvadrata
// Stampa vreme u sekundama za izvrsenje programa
public class Pkvadrata {

	public static void main(String[] args) {
		long početnoVreme;
		long završnoVreme;
		double protekloVreme;

		početnoVreme = System.currentTimeMillis();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite veličinu stranice kvadrata: ");
		int stranica = ulaz.nextInt();
		int obim = stranica * 4;
		int povrsina = stranica * stranica;

		System.out.println("Obim kvadrata je: " + obim + "\nPovršina kvadrata je: " + povrsina);
		završnoVreme = System.currentTimeMillis();
		protekloVreme = (završnoVreme - početnoVreme) / 1000.0;
		System.out.println();
		System.out.print("Vreme izvršavanja u sekundama je: ");
		System.out.println(protekloVreme);
		
	}

}

package programskaResenja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CenaKarte {

	// Program omogucuje da izaberete cenu karte
	// Izracunava finalnu cenu u zavisnosti od dana (radni-neradni)

	public static void main(String[] args) {
		double x = 0;
		double y = 0;

		System.out.println("Opcije menija su :");
		System.out.println(" 1. ponedeljak");
		System.out.println(" 2. utorak");
		System.out.println(" 3. sreda");
		System.out.println(" 4. cetvrtak");
		System.out.println(" 5. petak");
		System.out.println(" 6. subota");
		System.out.println(" 7. nedelja");
		System.out.println();

		double cena = Double.parseDouble(JOptionPane.showInputDialog("Unos cene"));

		x = cena;
		y = (x * (5f / 100f));
		double radni = x - y;
		double neradni = x + y;

		System.out.print("Unesite broj opcije koju želite: ");
		Scanner ulaz = new Scanner(System.in);
		int brojOpcije = ulaz.nextInt();
		switch (brojOpcije) {
		case 1:
			System.out.println("Izabrali ste ponedeljak i vasa cena karte je:\n" + radni);
			break;
		case 2:
			System.out.println("Izabrali ste utorak i vasa cena karte je:\n " + radni);
			break;
		case 3:
			System.out.println("Izabrali ste sreda i vasa cena karte je:\n " + radni);
			break;
		case 4:
			System.out.println("Izabrali ste cetvrtak i vasa cena karte je:\n " + radni);
			break;
		case 5:
			System.out.println("Izabrali ste petak i vasa cena karte je:\n " + radni);
			break;
		case 6:
			System.out.println("Izabrali ste subota i vasa cena karte je:\n " + neradni);
			break;
		case 7:
			System.out.println("Izabrali ste nedelja i vasa cena karte je:\n " + neradni);
			break;
		default:
			System.out.println("Greška: pogrešna opcija !");
		}
	}
}

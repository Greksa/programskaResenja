package programskaResenja;
import javax.swing.JOptionPane;
public class Ostatak2 {

	public static void main (String args []) {
		
		double budzet, cena1, cena2, cena3, cena4, budzet2, protekloVreme;
	    long pocetnoVreme, zavrsnoVreme;
	    pocetnoVreme = System.currentTimeMillis();
		System.out.println("Program izracunava ostatak budzeta nakon rashoda");
		
		budzet = Double.parseDouble (JOptionPane.showInputDialog ("Unesite vas budzet"));
		System.out.println ("Vas budzet je: " + budzet);
		cena1 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite cenu prvog artikla"));
		cena2 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite cenu drugog artikla"));
		cena3 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite cenu treceg artikla"));
		cena4 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite cenu cetvrtog artikla"));
		
		budzet2 = budzet - (cena1 + cena2 + cena3 + cena4);
		
		System.out.println("Vas budzet na kraju nedelje je: " + budzet2);
		zavrsnoVreme = System.currentTimeMillis();
		protekloVreme = (zavrsnoVreme - pocetnoVreme ) / 1000.0;
		System.out.println();
		System.out.print("Vreme izvršavanja u sekundama je: ");
		System.out.println(protekloVreme);
	}
	
}

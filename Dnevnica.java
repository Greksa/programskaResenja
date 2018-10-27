package programskaResenja;

import javax.swing.JOptionPane;

//PROGRAM IZRACUNAVA DNEVNICU NA OSNOVU UNOSA PLATE
public class Dnevnica {

	public static void main(String[] args) {
		long poèetnoVreme = 0;
		long završnoVreme;
		double protekloVreme;

		double x;
		double y;
		double z;

		double plata = Double.parseDouble(JOptionPane.showInputDialog("Unos plate"));
		double dani = Double.parseDouble(JOptionPane.showInputDialog("Unos dana u mesecu"));

		x = plata;
		y = dani;
		z = plata / dani;

		JOptionPane.showMessageDialog(null, "Dnevnica za ovaj mesec je: " + z);

		završnoVreme = System.currentTimeMillis();
		protekloVreme = (završnoVreme - poèetnoVreme) / 1000.0;
		System.out.println();
		System.out.print("Vreme izvršavanja u sekundama je: ");
		System.out.println(protekloVreme);

	}

}

package programskaResenja;
import javax.swing.JOptionPane;

public class RastProcenti {

	// Program izracunava postotni rast od 5% od ukupne cene za svaki naredni mesec
	// Ako ukupna cena predje 10000 ispisuje korisniku poruku
	// Ako je ukupna cena manja ispisuje drugu poruku

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z = 0;

		double cena = Double.parseDouble(JOptionPane.showInputDialog("Unos cene"));
		double mesecniRast = Double.parseDouble(JOptionPane.showInputDialog("Unos broja meseci"));

		x = cena;
		y = mesecniRast;
		z = (x * (5f / 100f));

		double ukupnaCena = (cena + z) * mesecniRast;
         System.out.println("Z je: " + z);
		if (ukupnaCena > 10000) {
			JOptionPane.showMessageDialog(null, "Placate previse.");
		} else {
			JOptionPane.showMessageDialog(null, "Placate tacno koliko treba: " + ukupnaCena);
		}
	}
}


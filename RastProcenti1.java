package programskaResenja;

// Program koji racuna porast cene od 3% od pocetne cene
// za svaki otpoceti dan (max 10 dana)
import javax.swing.JOptionPane;

public class RastProcenti1 {

	public static void main(String[] args) {
		JOptionPane tastatura = new JOptionPane(System.in);
		double cena, totalnaCena, dan;
		double rast = 0.03;
		System.out.println(" Program izracunava porast cene za 3% od pocetne cene za svaki otpoceti dan (10 dana)\n");

		cena = Double.parseDouble(JOptionPane.showInputDialog("Unos cene"));
		dan = Double.parseDouble(JOptionPane.showInputDialog("Unos dana"));
		totalnaCena = cena;
		System.out.println("Tabela Rasta od %3 na 10 dana za svaki dan: ");
		for (int i = 0; i <= 10; i++) {
			dan = totalnaCena * rast;
			totalnaCena += dan;

			System.out.println(i + " - " + totalnaCena);

		}

	}

}

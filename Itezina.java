package programskaResenja;
import javax.swing.JOptionPane;
// program izracunava idealnu ljudsku tezinu

public class Itezina {

	public static void main (String args []) {
		
		double x, y, pvreme, zvreme, fvreme;
		pvreme = System.currentTimeMillis();
		pvreme = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, "Program racuna vasu idealnu tezinu");
		x = Double.parseDouble (JOptionPane.showInputDialog("Unesite vasu visinu... "));
		y = x - 110;
		JOptionPane.showMessageDialog(null,"Vasa idealna tezina je: " + y);
		
		zvreme = System.currentTimeMillis();
		fvreme = (zvreme - pvreme) / 1000.0;
		
		System.out.println("Vreme utroseno za ovaj zadatak je: " + fvreme);
		zvreme = System.currentTimeMillis();
		
		
}
}
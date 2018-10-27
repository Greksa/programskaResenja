package programskaResenja;
import javax.swing.JOptionPane;
public class BrutoPlata {

	public static void main (String args []) {
		System.out.println("Program racuna bruto zaradu");
		double x, y;
		
		System.out.println("Unesite vasu platu...");
		x = Double.parseDouble (JOptionPane.showInputDialog("Unos plate"));
		y = x + (x * 0.75);
		System.out.println("Bruto plata je: "+ y);
		
		
	}
}

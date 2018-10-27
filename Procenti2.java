package programskaResenja;
import javax.swing.JOptionPane;
public class Procenti2 {
// program izracunava popust
	
	public static void main (String args []) {
		
		Double x, y, z, popust, fpopust;
		System.out.println("Program racuna popust u dinarima na osnovu unetih vrednosti!");
		x = Double.parseDouble(JOptionPane.showInputDialog("Unesite vasu cenu"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Unesite vas popust"));
		
		z = x * (y / 100f);
		popust = x - z;
		fpopust = x - popust;
		System.out.println("popust na ovaj proizvod je "+ fpopust + " dinara");
		
		
	}
}

package programskaResenja;
import javax.swing.JOptionPane;
// program racuna platu na osnovu dnevnice za 20 dana!
public class Plata {
	public static void main (String args []) {
		
	
	double x, y, z;
	
	System.out.println ("Program racuna visinu plate za 20 dana na osnovu dnevnice!");
	x = Double.parseDouble(JOptionPane.showInputDialog("Unesite vasu dnevnicu..."));
	
	y = x * 20;
	
	JOptionPane.showMessageDialog(null, "Vasa plata je: " + y);
	

}
}
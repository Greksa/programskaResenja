package programskaResenja;
import javax.swing.JOptionPane;
// program konvertuje kilograme u grame

public class KgToGram {
public static void main (String args []) {
	
	double x, y, pvreme,zvreme,fvreme;
	
	pvreme = System.currentTimeMillis();
	x = Double.parseDouble (JOptionPane.showInputDialog("Unesite vasu tezinu"));
	y = x * 1000;
	
	System.out.println("Vasa tezina u gramima je: " + y);
	zvreme = System.currentTimeMillis();
	
	fvreme = (zvreme - pvreme) / 1000.0;
	System.out.println("Utroseno vreme je: " + fvreme);
	
}
}

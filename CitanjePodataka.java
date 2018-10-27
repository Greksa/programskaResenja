package programskaResenja;

import javax.swing.JOptionPane;

public class CitanjePodataka {

	public static void main(String[] args) {

		
		
		double x2 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite X2"));
		double y2 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite Y2"));
		double x3 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite X3"));
		double y3 = Double.parseDouble (JOptionPane.showInputDialog ("Unesite Y3"));
		double a, b , c, s;
		
		
		
		a = Math.sqrt ((x2 * x2 - x3 * x3) + (y2 * y2 - y3 * y3));
	
		
	
System.out.println(a);

	}

}

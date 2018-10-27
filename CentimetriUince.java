package programskaResenja;
// program pretvara centimetre u ince
// na ovom primeru konvertujemo dimanzije A4 formata
public class CentimetriUince {

	static double konvercija (double cm) {
		double inci = 0.3937 * cm;
		System.out.printf ("Dimenzije A4 formata u incima su: %.2f \n", inci);
		
		return 0;
	}
	
	public static void main (String args [] ) {
		System.out.println("Program pretvara centimetre u ince");
		
	 
		double visina = 24.7;
		double sirina = 42.0;
		konvercija (visina);
		konvercija (sirina);
	}
}
